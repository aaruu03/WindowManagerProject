import java.awt.Color;
import java.util.Random;

public class Window implements Comparable{
	private int x;
	private int y;
	private int z;
	private int width;
	private int height;
	private Color color;
	Random rand = new Random();
	public Window() {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.setH(height);
		this.setW(width);
		this.setColor(color);
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = rand.nextInt(750);
		//this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = rand.nextInt(800);
	}
	
	public int getH() {
		return height;
	}
	public void setH(int height) {
		//this.height = rand.nextInt(250);
		this.height = 200;
	}
	public int getW() {
		return width;
	}
	public void setW(int width) {
		//this.width = rand.nextInt(200);
		this.width = 250;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setColor(Color color) {
		Random rand = new Random();
    	this.color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
  
	}
	public Color getColor() {
		return color;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
