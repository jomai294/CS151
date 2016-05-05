import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WhiteBoard extends JFrame{
		
		private int x;
		private int y;
		
		
		public WhiteBoard() {
			
				x = 1200;
				y = 1200;
				
				super.setSize(x, y);
				super.setVisible(true);
				super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				super.setLayout(new BorderLayout());
				
				
				
				//creates the whiteboard
				final Canvas canvas = new Canvas();
				super.add(canvas, BorderLayout.CENTER);
				JPanel panel = new JPanel();
				super.add(panel,BorderLayout.WEST);
				JButton button = new JButton("Rectangle");
				button.setPreferredSize(new Dimension(100,50));
				panel.add(button);
				button.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                		canvas.addShape(new DRectModel());
	                		
	                }
				});
				JButton button2 = new JButton("Oval");
				button2.setPreferredSize(new Dimension(100,50));
				
				panel.add(button2);
				
				JButton button3 = new JButton("Line");
				button3.setPreferredSize(new Dimension(100,50));
				panel.add(button3);
				
				JButton button4 = new JButton("Text");
				button4.setPreferredSize(new Dimension(100,50));
				panel.add(button4);
				
				
				
		}
		
		
		public static void main(String[] args) {
				WhiteBoard w = new WhiteBoard();
		}
}
