
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Canvas extends JPanel {
	
	ArrayList<DShapes> Shapes;
	private int preX;
	private int preY;
	//gets the shape currently selected
	private DShapes shapeSelected;
	
	
	
	
	public Canvas() {
		Shapes =  new ArrayList<DShapes>();
		super.setSize(400,400);
		super.setLayout(new BorderLayout());
		super.setVisible(true);
		super.setBackground(Color.WHITE);
		super.addMouseListener(new Mouse());
		super.addMouseMotionListener(new Mouse());
		
		
		
	}
	
	public void setShapeSelected(DShapes d) {
			shapeSelected = d;
	}
	
	public DShapes getShapeSelected() {
			return shapeSelected;
	}

	public void addRect() {
		// TODO Auto-generated method stub
		DShapes ds = new DRect();
		Shapes.add(ds);
		ds.draw(getGraphics());
		setShapeSelected(ds);
		
	}
	
	
	public void addOval() {
		DShapes ds = new DOval();
		Shapes.add(ds);
		ds.draw(getGraphics());
		setShapeSelected(ds);
	}
	
	public void addLine() {
		DShapes ds = new DLine();
		Shapes.add(ds);
		ds.draw(getGraphics());
		//setShapeSelected(ds);
	}
	
	public void addTextField() {
		DShapes ds = new DText();
		Shapes.add(ds);
		ds.draw(getGraphics());
		//setShapeSelected(ds);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (DShapes d : Shapes) {
				d.draw(g);
		}
	}


	class Mouse implements MouseListener, MouseMotionListener {

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
		//for selecting shape
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
//			if (shapeSelected.getBounds(e.getX(), e.getY()))
//			{
//					System.out.println("mousepressed works");
//					preX = e.getX();
//					preY = e.getY();
//			}
			
			//System.out.println(Shapes.size());
			
			
			
			
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

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
			int xmouse = e.getX();
			int ymouse = e.getY();
			
			if (shapeSelected.getBounds(xmouse,ymouse))
			{
					shapeSelected.getDShapeModel().setX(xmouse - shapeSelected.getDShapeModel().getWidth() / 2);
					shapeSelected.getDShapeModel().setY(ymouse - shapeSelected.getDShapeModel().getHeight() / 2);
					
			}
			
			
			repaint();
			
			
			
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
			
		}
			
	}

	
	
	
}

