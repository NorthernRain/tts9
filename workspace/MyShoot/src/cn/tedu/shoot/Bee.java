package cn.tedu.shoot;

import java.awt.image.BufferedImage;

public class Bee extends FlyingObject implements Award{
	public static BufferedImage[] images;
	static {
		images=new BufferedImage[6];
		for (int i = 0; i < images.length; i++) {
			if (i<2) {
				images[i]=readImage("bee"+i+".png");
			}
			else {
				images[i]=readImage("bom"+(i-1)+".png");
			}
		}
	}

	private int speed;
	private int xSpeed;
	public Bee() {
		super(60, 51);
		speed=4;
		xSpeed=6;
	}
	public void step() {
		y+=speed;
		x+=xSpeed;
		if(x<=0||x>=(World.WIDTH-this.width))
			xSpeed=-xSpeed;
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

	public int getAwardType() {
		
		return (int)(2*Math.random());
	}
	
}
