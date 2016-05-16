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
						d.setBounds(e.getX(), e.getY());
						System.out.println(d.getDShapeModel().getX());
				}
				
				
				
		}
		//for selecting shape
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			Point p = e.getPoint();
			preX = p.x;
			preY = p.y;
			
			//System.out.println(Shapes.size());
			
			for (DShapes d : Shapes) {
					
					System.out.println("the shape is at" + d.getDShapeModel().getX());
					
			}
			
			
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
			if (shapeSelected.getBounds(preX, preY)) {
				shapeSelected.getDShapeModel().setX(e.getX());
				shapeSelected.getDShapeModel().setY(e.getY());
				shapeSelected.setBounds(e.getX(), e.getY());
			}
			
			
			
			
			repaint();
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
			
			
		}
			
	}

	
	
	
}


