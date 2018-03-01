package breakout.underAllSau;

public class JustOneBrickInTheWall {

	private int height;
	private int width;
	private double xPos;
	private double yPos;

	
	public JustOneBrickInTheWall(int height, int width, double xPos, double yPos) {
		this.height = height;
		this.width = width;
		this.xPos = xPos;
		this.yPos = yPos;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public double getxPos() {
		return xPos;
	}


	public void setxPos(double xPos) {
		this.xPos = xPos;
	}


	public double getyPos() {
		return yPos;
	}


	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	
	
	
}
