package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Airplane extends FlyingObject implements Score{
	public static BufferedImage[] images;
	static {
		images=new BufferedImage[6];
		for (int i = 0; i < images.length; i++) {
			if (i<2) {
				images[i]=readImage("airplane"+i+".png");
			}
			else {
				images[i]=readImage("bom"+(i-1)+".png");
			}
		}
	}

	private int speed;

	public Airplane() {
		super(48, 50);
		speed = 9;
	}

	public void step() {
		y += speed;
	}
	private  int index=0;
	private int deadIndex=2;
	public BufferedImage getImage() {
		if (isLife()) {
			return images[index++%2];
		}
		else if (isDead()) {
			BufferedImage img=images[deadIndex++];
			if (deadIndex==images.length) {
				state=REMOVE;
			}
			return img;
		}
		return null;
	}
	
	public int getScore() {
		
		return 1;
	}
}
