package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class BulletE extends FlyingObject {
	public static BufferedImage image;
	static {
		image=readImage("bullete.png");
	}

	private int speed;

	public BulletE(int x, int y) {
		super(8, 20, x, y);
		speed = 10;
	}

	public void step() {
		y += speed;

	}
	public BufferedImage getImage() {
		if (isLife()) {
			return image;
		} else if (isDead())
			state = REMOVE;
		return null;
	}
}
