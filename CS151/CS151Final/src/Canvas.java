import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class Canvas extends JPanel {
	
	ArrayList<DShapes> Shapes;
	private int preX;
	private int preY;
	private DShapes shape;
	
	
	
	public Canvas() {
		Shapes =  new ArrayList<DShapes>();
		super.setSize(400,400);
		super.setLayout(new BorderLayout());
		super.setVisible(true);
		super.setBackground(Color.WHITE);
		super.addMouseListener(new Mouse());
	}
	
	


	public void addRect() {
		// TODO Auto-generated method stub
		DShapes ds = new DRect();
		Shapes.add(ds);
		ds.draw(getGraphics());
		
	}
	
	
	public void addOval() {
		DShapes ds = new DOval();
		Shapes.add(ds);
		ds.draw(getGraphics());
	}
	
	public void addLine() {
		DShapes ds = new DLine();
		Shapes.add(ds);
		ds.draw(getGraphics());
	}
	
	public void addTextField() {
		DShapes ds = new DText();
		Shapes.add(ds);
		ds.draw(getGraphics());
	}


	class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				for (DShapes d : Shapes) {
						if (d.getBounds(e.getX(), e.getY())) {
								System.out.println("Mouse x is " + e.getX());
								System.out.println("Mouse y is " + e.getY());
								
								System.out.println("within shape");
						}
				}
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
			
	}

	
	
	
}


