package breakout.underAllSau;

import java.util.Observable;
import java.util.Observer;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class PrettyPleaseLookAtMe extends GraphicsProgram implements Observer {

	public void init() {
		setSize(300, 600);

		getGCanvas().requestFocus();
		addKeyListeners();

		drawBall();
		drawPaddle();
	}
	
	private void drawBall() {
		
		GOval goVal = new GOval(PiggeldiFly.getDiameter(), PiggeldiFly.getDiameter());
		
		add(goVal, PiggeldiFly.getxPos(), PiggeldiFly.getyPos());
//		add(goVal, 10, 10);
		
	}
	
	private void drawPaddle() {
		
		GRect goPaddle = new GRect(PiggeldiPaddle.getWidth(), PiggeldiPaddle.getHeight());
		
		add(goPaddle, PiggeldiPaddle.getxPos(), PiggeldiPaddle.getyPos());
	}
	
	@Override
	public void update(Observable o, Object object) {
		// TODO
	}

}
