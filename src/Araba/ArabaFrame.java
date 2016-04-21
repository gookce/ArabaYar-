package Araba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ArabaFrame extends JPanel implements ActionListener {   
	
	private Timer timer;
	private Araba arabam;
	private Araba2 arabam2;
	private Nesne cikis;
	private final int DELAY = 10;
	
	public ArabaFrame(){
		
		initFrame();
		
	}

    private void initFrame() {
        
        addKeyListener((KeyListener) new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        arabam = new Araba();
        arabam2 = new Araba2();
        cikis=new Nesne();
        
        timer = new Timer(DELAY, this);
        timer.start();           
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D g2d1 = (Graphics2D) g;
        Graphics2D g2d2 = (Graphics2D) g;
        
        g2d.drawImage(arabam.getImage(), arabam.getX(), arabam.getY(), this);  
        g2d1.drawImage(arabam2.getImage(), arabam2.getX(), arabam2.getY(), this); 
        g2d2.drawImage(cikis.getImage(), cikis.getX(), cikis.getY(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    	arabam.move();
    	arabam2.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
        	arabam.keyReleased(e);
        	arabam2.keyReleased(e);      	
        		
        }

        @Override
        public void keyPressed(KeyEvent e) {
        	arabam.keyPressed(e);
        	arabam2.keyPressed(e);
        }
    }
}