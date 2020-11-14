import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*; 
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.JPanel;

public class myJPanel extends JPanel implements MouseListener, KeyListener, MouseMotionListener{
	
	WindowManager windowm;
	
	public myJPanel() {
		// Set up mouse support (clicks and move) (do this after you get fake windows drawing correctly)
		this.addMouseListener(this);
        //Create a windowManager
		/*WindowManager*/ windowm = new WindowManager();

        //Ask the windowManager to add 10 "fake windows"
		for(int i = 0; i<10; i++) {
			windowm.add(i);
		}
		

	}
	
	public void paintComponent(Graphics g) {
		windowm.drawInitial(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
		System.out.println("mx: " + mx + " my: " + my);
		windowm.findWindowByPosition(mx, my);
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
