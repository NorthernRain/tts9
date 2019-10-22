package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {

	public static BufferedImage[] images;
	static {
		images = new BufferedImage[2];
		for (int i = 0; i < images.length; i++) {

			images[i] = readImage("hero" + i + ".png");

		}
	}
	private int life;
	private int double_Fire;

	public Hero() {
		super(97, 139, World.WIDTH / 2 - 97 / 2, 400);
		life = 3;
		double_Fire = 20;
	}

	public void step() {

	}

	private int index = 0;

	public BufferedImage getImage() {

		return images[index++ % 2];

	}

	public void moveTo(int x, int y) {
		/*if (x > this.width / 2 && x < World.WIDTH - this.width / 2 && y > this.height / 2
				&& y < World.HEIGHT - this.height / 2) {*/
			this.x = x - this.width / 2;
			this.y = y - this.height / 2;
	/*	}*/

	}

	public Bullet[] shoot() {
		int xStep = this.width / 4;
		int yStep = 20;
		if (double_Fire > 0) {
			xStep = this.width / 5;
			Bullet[] bs = new Bullet[4];
			bs[0] = new Bullet(this.x + 1 * xStep, this.y - yStep);
			bs[1] = new Bullet(this.x + 2 * xStep, this.y - yStep);
			bs[2] = new Bullet(this.x + 3 * xStep, this.y - yStep);
			bs[3] = new Bullet(this.x + 4 * xStep, this.y - yStep);
			double_Fire -= 2;
			return bs;
		} else {
			Bullet[] bs = new Bullet[2];
			bs[0] = new Bullet(this.x + 1 * xStep, this.y - yStep);
			bs[1] = new Bullet(this.x + 3 * xStep, this.y - yStep);
			return bs;
		}
	}

	public int getLife() {
		return life;
	}

	public void addLife() {
		if (life < 5)
			life++;
	}

	public void subLife() {
		life--;
		if (life < 0)
			state = DEAD;
	}

	public void addDoubleFire() {
		double_Fire += 20;
	}

	public void clearDoubleFire() {
		double_Fire = 0;
	}

}
