import java.awt.Graphics;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jpanel, frame, initialization etc
		JFrame frame = new JFrame();
		frame.setSize(1000,1000);
		myJPanel jpanel = new myJPanel();
		frame.add(jpanel);
		frame.setVisible(true);
		jpanel.setVisible(true);
		//WindowManager windowm = new WindowManager();
		//windowm.add();
		//windowm.add();
		System.out.println("hiii!!");
	}

}
