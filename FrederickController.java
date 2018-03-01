package breakout.underAllSau;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrederickController implements KeyListener {

//	ErklärBärModel model;
//	
//	public FrederickController(ErklärBärModel model) {
//		this.model = model;
//	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			PiggeldiPaddle.setxPos(PiggeldiPaddle.getxPos() - 30);
	
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		
			PiggeldiPaddle.setxPos(PiggeldiPaddle.getxPos() + 30);
		
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO when input == "doctor" everything explodes. *THUMBS UP*

	}

}
