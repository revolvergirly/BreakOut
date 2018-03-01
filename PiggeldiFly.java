package breakout.underAllSau;

public class PiggeldiFly {

	private static final double DIAMETER = TheGreatBeyond.getWidth() * 0.03;
	private static double xPos = TheGreatBeyond.getWidth() * 0.5 - DIAMETER * 0.5;
	private static double yPos = TheGreatBeyond.getHeight() - PiggeldiPaddle.getHeight() * 2 - DIAMETER;
	
	void moveBitchGetOutTheWay() {
		// Geschwindigkeit und "Winkel"
	}
	
	public static double getDiameter() {
		return DIAMETER;
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
