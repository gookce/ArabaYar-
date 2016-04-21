package Araba;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ArabaMain extends JFrame {
	
	public ArabaMain() {
        
        initMain();
    }
 
    private void initMain() {
        
        add(new ArabaFrame());
        
        setSize(900, 500);
        setResizable(false);
        
        setTitle("ARABA YARIŞI");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
        	@Override
            public void run() {
                
        		ArabaMain ekran = new ArabaMain();
                ekran.setVisible(true);
            }
        });
    }
}
