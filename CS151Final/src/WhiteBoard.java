import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhiteBoard extends JFrame{
		
		private int x;
		private int y;
		public WhiteBoard()
		{
				x = 1200;
				y = 1200;
				
				super.setSize(x, y);
				super.setVisible(true);
				super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				super.setLayout(new BorderLayout());
				
				super.add(new Canvas(),BorderLayout.WEST);
				
				
		}
		public static void main(String[] args)
		{
				WhiteBoard w = new WhiteBoard();
		}
}
