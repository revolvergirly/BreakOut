package breakout.underAllSau;

public class PiggeldiPaddle {

	private static final double WIDTH = TheGreatBeyond.getWidth() * 0.2;
	private static final double HEIGHT = TheGreatBeyond.getHeight() * 0.015;
	private static double xPos = TheGreatBeyond.getWidth() * 0.5 - WIDTH * 0.5;
	private static double yPos = TheGreatBeyond.getHeight() - HEIGHT * 2;

	public static double getWidth() {
		return WIDTH;
	}

	public static double getHeight() {
		return HEIGHT;
	}

	public static double getxPos() {
		return xPos;
	}

	public static void setxPos(double newXPos) {
		xPos = newXPos;
	}

	public static double getyPos() {
		return yPos;
	}

	public static void setyPos(double newYPos) {
		yPos = newYPos;
	}
	
}
