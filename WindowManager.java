import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WindowManager {
	
	private static ArrayList<Window> window;

	public WindowManager() {
		window = new ArrayList<Window>();
	}
	
	public void add(int z) {
		//Random rand = new Random();
		//int x = rand.nextInt(995);
		//int y = 1;
		//int z = 1;
		System.out.println("x: " + " y: " );
		Window wind = new Window(/*z*/);
		wind.setZ(z);
		System.out.println("x: " + wind.getX() + " y: " + wind.getY() + " z: " + z);
		window.add(wind);
	}
	
	public void bringToFront(Window windowchange) {
		//set z to 9 and move others down by 1
		int tempindex = windowchange.getZ();
		for(int i = 0; i<10; i++) {
			System.out.println("BEFORE x: "+ window.get(i).getX() + " y: "+ window.get(i).getY()+ " z: " + window.get(i).getZ());
		}
		windowchange.setZ(9);
		Window tempwind = window.get(tempindex);
		window.remove(tempindex);
		for(int i = tempindex; i<window.size();i++) {
			window.get(i).setZ(window.get(i).getZ()-1);
		}
		window.add(9,tempwind);
		for(int i = 0; i<10; i++) {
			System.out.println("AFTER x: "+ window.get(i).getX() + " y: "+ window.get(i).getY()+ " z: " + window.get(i).getZ());
		}
		//drawInitial(null);
		//jpanel.paintComponent();
	}
	
	public static ArrayList<Window> getWindows() {
		return window;
	}
	
	public void findWindowByPosition(int mx, int my) {
		//take x,y of mouse and return panel
		int tempz = -1;
		//find all panels that have that xy
		for(int i = 0; i<10; i++) {
			if(window.get(i).getX() <= mx && mx <= window.get(i).getX()+250) {
				if(window.get(i).getY() <= my && my <= window.get(i).getY()+200) {
					tempz = window.get(i).getZ();
					System.out.println("found window with xyz: " + mx + "," + my + "," + tempz + "this is window number "+ i);
				}
			}
		}
		//sort through those panels to find which has the highest z(bc top)
		 bringToFront(window.get(tempz));
	}
	
	public void drawInitial(Graphics g) {
		for(int i = 0; i<10; i++) {
			int x = window.get(i).getX();
	    	int y = window.get(i).getY();
	    	int h = window.get(i).getH();
	    	int w = window.get(i).getW();
	    //	Random rand = new Random();
	    	//Color randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	    	//g.setColor(randomColor);
	    	Color color = window.get(i).getColor();
	    	g.setColor(color);
	    	g.fillRect(x, y, w, h);
		}
	}
}
