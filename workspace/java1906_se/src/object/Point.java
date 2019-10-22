package object;

/**
 * 使用当前类测试object相关方法的重写
 * 
 * 
 * @author tarena
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point() {
	
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	/*
	 * 通常我们使用这个方法就应当重写这个方法，（java API 提供的类大部分已经重写了，无需我们重写）
	 * 返回的字符串没有严格的格式要求，但应当包含这个类对象的属性信息， 便于通过返回的字符串了解当前对象的属性。
	 * 
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		return "(" + x + "," + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



}
