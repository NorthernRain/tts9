package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public abstract class FlyingObject {

	protected static final int LIFE = 0;
	protected static final int DEAD = 1;
	protected static final int REMOVE = 2;

	protected int state = LIFE;

	public static BufferedImage readImage(String fileName) {
		try {
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName));
			return img;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public abstract BufferedImage getImage();

	protected int width;
	protected int height;
	protected int x;
	protected int y;

	public FlyingObject(int width, int height) {
		this.width = width;
		this.height = height;
		this.x = (int) (Math.random() * (World.WIDTH - this.width));
		this.y = -this.height;

	}

	public FlyingObject(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public abstract void step();

	public boolean isLife() {
		return state == LIFE;
	}

	public boolean isDead() {
		return state == DEAD;
	}

	public boolean isRemove() {
		return state == REMOVE;
	}

	public void goDead() {
		state = DEAD;
	}

	public BulletE[] eshoot(FlyingObject o) {
		BulletE[] bs = new BulletE[1];
		bs[0] = new BulletE(o.x + o.width / 2, o.y - 5);
		return bs;
	}

	public boolean hit(FlyingObject o) {
		int x1 = this.x - o.width;
		int x2 = this.x + this.width;
		int y1 = this.y - o.height;
		int y2 = this.y + this.height;

		int x = o.x;
		int y = o.y;
		return x >= x1 && x <= x2 && y >= y1 && y <= y2;
	}

	public boolean hitE(FlyingObject o) {
		int x1 = this.x + this.width / 2 - o.width / 8;
		int x2 = this.x + this.width / 2 + o.width / 8;
		int y1 = this.y - o.height;
		int y2 = this.y + this.height;

		int x = o.x + o.width / 2;
		int y = o.y;
		return x >= x1 && x <= x2 && y >= y1 && y <= y2;
	}

	public boolean outOfBounds() {
		return this.y >= World.HEIGHT;
	}

	public boolean outOfBoundsB() {
		return this.y < 0;
	}

	public void paintObject(Graphics g) {
		g.drawImage(this.getImage(), this.x, this.y, null);
	}
}
