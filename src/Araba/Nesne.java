package Araba;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Nesne {

    private int x;
    private int y;
    private Image image;
	
	public Nesne(){
		
		 initNesne();		
	}
	
    private void initNesne() {
        
        ImageIcon imageicon = new ImageIcon("Assets/exit.png");
        image = imageicon.getImage();
        x = 750;
        y = 30;        
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
}