package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class World extends JPanel {
	public static final int WIDTH = 420;
	public static final int HEIGHT = 700;

	public static final int START = 0;
	public static final int RUNNING = 1;
	public static final int PAUSE = 2;
	public static final int GAME_OVER = 3;
	private int state = START;

	private static BufferedImage start, pause, gameover;
	static {
		start = FlyingObject.readImage("start.png");
		pause = FlyingObject.readImage("pause.png");
		gameover = FlyingObject.readImage("gameover.png");
	}
	Sky sky = new Sky();
	Hero hero = new Hero();
	Bullet[] bullets = {};
	BulletE[] bulletse = {};
	FlyingObject[] enemies = {};

	public FlyingObject generateEnemies() {
		int index = (int) (Math.random() * 60);
		if (index < 20) {
			return new Airplane();
		} else if (index < 40) {
			return new BigAirplane();
		} else {
			return new Bee();
		}
	}

	private int enterIndex = 0;

	public void enterEnemies() {
		if (enterIndex++ % 40 == 0) {
			enemies = Arrays.copyOf(enemies, enemies.length + 1);
			enemies[enemies.length - 1] = generateEnemies();
		}

	}

	private int shootIndex = 0;

	public void shootAction() {
		if (shootIndex++ % 30 == 0) {
			Bullet[] bs = hero.shoot();
			bullets = Arrays.copyOf(bullets, bullets.length + bs.length);
			System.arraycopy(bs, 0, bullets, bullets.length - bs.length, bs.length);
		}

	}

	private int eshootIndex = 0;

	public void eshootAction() {
		if (eshootIndex++ % 40 == 0) {
			for (int i = 0; i < enemies.length; i++) {
				FlyingObject f = enemies[i];
				if (!(f instanceof Bee)) {
					BulletE[] bsE = f.eshoot(f);
					bulletse = Arrays.copyOf(bulletse, bulletse.length + bsE.length);
					System.arraycopy(bsE, 0, bulletse, bulletse.length - bsE.length, bsE.length);
				}

			}
		}

	}

	public void step() {
		sky.step();
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].step();
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].step();
		}
		for (int i = 0; i < bulletse.length; i++) {
			bulletse[i].step();
		}

	}

	public void bulletBangAction() {
		for (int i = 0; i < bullets.length; i++) {
			Bullet b = bullets[i];
			for (int j = 0; j < enemies.length; j++) {
				FlyingObject f = enemies[j];

				if (b.isLife() && f.isLife() && f.hit(b)) {
					b.goDead();
					f.goDead();

					if (f instanceof Score) {
						Score s = (Score) f;
						score += s.getScore();
					}

					if (f instanceof Award) {
						Award a = (Award) f;
						switch (a.getAwardType()) {
						case Award.DOUBLE_FIRE:
							hero.addDoubleFire();
							break;
						case Award.LIFE:
							hero.addLife();
							break;

						}
					}
				}

			}
		}
	}

	public void heroBangAction() {
		for (int i = 0; i < enemies.length; i++) {

			FlyingObject f = enemies[i];

			if (f.isLife() && hero.isLife() && f.hit(hero)) {

				f.goDead();
				hero.subLife();
				hero.clearDoubleFire();
			}

		}
		for (int i = 0; i < bulletse.length; i++) {

			BulletE b = bulletse[i];

			if (b.isLife() && hero.isLife() && b.hitE(hero)) {

				b.goDead();
				hero.subLife();
				hero.clearDoubleFire();
			}

		}
	}

	public void outOfBoundsAction() {
		int index = 0;
		FlyingObject[] liveEnemies = new FlyingObject[enemies.length];
		for (int i = 0; i < enemies.length; i++) {
			if (!enemies[i].isRemove() && !enemies[i].outOfBounds()) {
				liveEnemies[index] = enemies[i];
				index++;
			}

		}
		enemies = Arrays.copyOf(liveEnemies, index);

		index = 0;
		BulletE[] liveBulletse = new BulletE[bulletse.length];
		for (int i = 0; i < bulletse.length; i++) {
			if (!bulletse[i].isRemove() && !bulletse[i].outOfBounds()) {
				liveBulletse[index] = bulletse[i];
				index++;
			}
		}
		bulletse = Arrays.copyOf(liveBulletse, index);

		index = 0;
		Bullet[] liveBullets = new Bullet[bullets.length];
		for (int i = 0; i < bullets.length; i++) {
			if (!bullets[i].isRemove() && !bullets[i].outOfBoundsB()) {
				liveBullets[index] = bullets[i];
				index++;

			}

		}
		bullets = Arrays.copyOf(liveBullets, index);
	}

	private int score = 0;

	public void paint(Graphics g) {
		sky.paintObject(g);
		hero.paintObject(g);

		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);

		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);

		}

		for (int i = 0; i < bulletse.length; i++) {
			bulletse[i].paintObject(g);

		}

		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;

		case PAUSE:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAME_OVER:
			g.drawImage(gameover, 0, 0, null);
			break;

		}
		g.drawString("SCORE: " + score, 15, 20);
		g.drawString("LIFE: " + hero.getLife(), 15, 40);

	}

	public void checkGameover() {
		if (hero.getLife() <= 0) {
			state = GAME_OVER;
		}
	}

	public void action() {
		MouseAdapter l = new MouseAdapter() {

			public void mouseMoved(MouseEvent e) {
				if (state == RUNNING) {
					hero.moveTo(e.getX(), e.getY());
				}

			};

			public void mouseClicked(MouseEvent e) {
				switch (state) {
				case START:
					state = RUNNING;

					break;
				case RUNNING:
					state = PAUSE;

					break;
				case PAUSE:
					state = RUNNING;

					break;
				case GAME_OVER:
					score = 0;
					sky = new Sky();
					hero = new Hero();
					enemies = new FlyingObject[0];
					bullets = new Bullet[0];
					bulletse = new BulletE[0];
					state = START;

					break;

				}
			}

		};
		this.addMouseListener(l);
		this.addMouseMotionListener(l);
		Timer timer = new Timer();
		int time = 30;
		timer.schedule(new TimerTask() {

			public void run() {
				if (state == RUNNING) {
					enterEnemies();
					shootAction();
					eshootAction();
					step();
					outOfBoundsAction();
					bulletBangAction();
					heroBangAction();
					checkGameover();
				}
				repaint();
			}
		}, time, time);
	}

	public static void main(String[] args) {
		World world = new World();
		JFrame frame = new JFrame("飞机大战");
		frame.add(world);
		frame.setSize(World.WIDTH, World.HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		world.action();
	}
}
