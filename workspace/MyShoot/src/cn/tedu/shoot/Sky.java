package cn.tedu.shoot;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sky extends FlyingObject {

	public static BufferedImage image;
	static {
		image = readImage("sky.png");

	}
	private int speed;
	private int y1;

	public Sky() {

		super(World.WIDTH, World.HEIGHT, 0, 0);
		speed = 3;
		y1 = -World.HEIGHT;
	}

	public void step() {
		y += speed;
		y1 += speed;
		if (y >= World.HEIGHT) {
			y = -World.HEIGHT;
		}
		if (y1 >= World.HEIGHT) {
			y1 = -World.HEIGHT;
		}
	}

	public BufferedImage getImage() {

		return image;
	}
	
	public void paintObject(Graphics g) {
		g.drawImage(this.getImage(), this.x, this.y, null);
		g.drawImage(this.getImage(), this.x, this.y1, null);
		
	}
}
