package Araba;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Araba2 {

	private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
	
	public Araba2(){
		
		 initAraba2();		
	}
	
    private void initAraba2() {
        
        ImageIcon imageicon = new ImageIcon("Assets/car2.png");
        image = imageicon.getImage();
        x = 40;
        y = 220;        
    }
    
    public void move() {
    	
        x += dx;
        y += dy;
    }

    public int getX() {
    	
        return x;
    }

    public int getY() {
    	
        return y;
    }

    public Image getImage() {
    	
        return image;
    }
    
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = -1;
        }

        if (key == KeyEvent.VK_D) {
            dx = 1;
        }

        if (key == KeyEvent.VK_W) {
            dy = -1;
        }

        if (key == KeyEvent.VK_S) {
            dy = 1;
        }
       
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
