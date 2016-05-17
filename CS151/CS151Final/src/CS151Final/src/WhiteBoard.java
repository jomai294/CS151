import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class WhiteBoard extends JFrame {

	public WhiteBoard() {
		
		super.setSize(1200,1000);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//super.setLayout(null);
		
		super.setDefaultLookAndFeelDecorated(true);
		super.setLayout(null);
		
		
		final Canvas c = new Canvas();
		
		super.add(c);
		c.setBounds(600, 0, 1000, 1000);
		
		JLabel label = new JLabel("Add: ");
		super.add(label);
		label.setBounds(0, 0, 50, 50);
		
		JButton RectBut = new JButton("RECT");
		super.add(RectBut);
		RectBut.setBounds(30,0,100,50);
		
		RectBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.addRect();
			}
			
		});
		
		JButton OvalBut = new JButton("OVAL");
		super.add(OvalBut);
		OvalBut.setBounds(150, 0, 100,50);
		
		OvalBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.addOval();
			}
			
		});

		JButton LineBut = new JButton("LINE");
		super.add(LineBut);
		LineBut.setBounds(270, 0, 100,50);
		
		LineBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.addLine();
			}
			
		});
		
		JButton TextBut = new JButton("Text");
		super.add(TextBut);
		TextBut.setBounds(390, 0, 100,50);
		
		TextBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.addTextField();
			}
			
		});
		
		JButton SColBut = new JButton("Set Color");
		super.add(SColBut);
		SColBut.setBounds(0, 70, 100, 50);
		
		JTextField jtf = new JTextField();
		super.add(jtf);
		jtf.setBounds(0,170, 150, 18);
		
		JButton moveToF = new JButton("Move To Front");
		super.add(moveToF);
		moveToF.setBounds(0, 230 , 150, 50);
		
		JButton moveToB = new JButton("Move To Back");
		super.add(moveToB);
		moveToB.setBounds(160, 230 , 150, 50);
		
		JButton RemoveBut = new JButton("Remove");
		super.add(RemoveBut);
		RemoveBut.setBounds(320, 230 , 150, 50);
		
		//JComboBox FontSlct = new JComboBox();
		
		JTable table = new JTable();
		table.setBounds(0, 600, 600, 600);
		 
	}
	public static void main(String[] args) {
		
		WhiteBoard wb = new WhiteBoard();
		DShapes s = new DShapes();
	}
	
}



