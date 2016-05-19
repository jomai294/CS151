import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Canvas extends JPanel {
	
	ArrayList<DShapes> Shapes;
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
	
	public void addColor(Color c) {
		
		shapeSelected.getDShapeModel().setColor(c);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (DShapes d : Shapes) {
			d.draw(g);
		}
		if (shapeSelected != null) {
			for(int i = 0; i < shapeSelected.getKnob().length; i++) {
				g.setColor(Color.BLACK);
				g.fillRect(shapeSelected.getKnob()[i].x-3,shapeSelected.getKnob()[i].y-3, 9, 9);
			}
		}
		
	}

	class Mouse implements MouseListener, MouseMotionListener {
		
		private DShapes selected = getShapeSelected();
		
		public void mouseClicked(MouseEvent e) {
			
			try
			{
				for (DShapes d : Shapes) {
					if (d.getBounds(e.getX(), e.getY())) {
						setShapeSelected(d);
						selected = d;
						repaint();
						System.out.println("Mouse x is " + e.getX());
						System.out.println("Mouse y is " + e.getY());
						System.out.println("within shape");
					}
				}
				
				if (selected.getKnob()[0].x - 3 < e.getX() && selected.getKnob()[0].x + 9 > e.getX() && selected.getKnob()[0].y - 3 < e.getY() && selected.getKnob()[0].y + 9 > e.getY()) {
						System.out.println("Knob 1");
				}
				else if (selected.getKnob()[1].x - 3 < e.getX() && selected.getKnob()[1].x + 9 > e.getX() && selected.getKnob()[1].y - 3 < e.getY() && selected.getKnob()[1].y + 9 > e.getY()) {
						System.out.println("Knob 2");
				}
				else if (selected.getKnob()[2].x - 3 < e.getX() && selected.getKnob()[2].x + 9 > e.getX() && selected.getKnob()[2].y - 3 < e.getY() && selected.getKnob()[2].y + 9 > e.getY()) {
						System.out.println("Knob 3");
				}
				else if (selected.getKnob()[3].x - 3 < e.getX() && selected.getKnob()[3].x + 9 > e.getX() && selected.getKnob()[3].y - 3 < e.getY() && selected.getKnob()[3].y + 9 > e.getY()) {
						System.out.println("Knob 4");
				}
			} catch (Exception v) {
				
			}
			
		}
		
		public void mousePressed(MouseEvent e) {
			for (DShapes d : Shapes) {
				if (d.getBounds(e.getX(),e.getY())) {
					setShapeSelected(d);
				}
			}
		}

		public void mouseReleased(MouseEvent e) {
			setShapeSelected(null);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseDragged(MouseEvent e) {
			try{
				//shape changes based on mouse
				shapeSelected.getDShapeModel().setX(e.getX());
				shapeSelected.getDShapeModel().setY(e.getY());
				shapeSelected.setBounds(e.getX()- shapeSelected.getDShapeModel().getWidth()/2, e.getY()-shapeSelected.getDShapeModel().getHeight()/2);
				
				//EDIT THIS
				if (shapeSelected != null) {
					shapeSelected.addBounds();
					shapeSelected.getKnob()[0] = new Point(shapeSelected.getDShapeModel().getX() , shapeSelected.getDShapeModel().getY());
					shapeSelected.getKnob()[1] = new Point(shapeSelected.getDShapeModel().getX() + shapeSelected.getDShapeModel().getWidth(),shapeSelected.getDShapeModel().getY());
					shapeSelected.getKnob()[2] = new Point(shapeSelected.getDShapeModel().getX() , shapeSelected.getDShapeModel().getY() + shapeSelected.getDShapeModel().getHeight());
					shapeSelected.getKnob()[3] = new Point(shapeSelected.getDShapeModel().getX() + shapeSelected.getDShapeModel().getWidth(),shapeSelected.getDShapeModel().getY() + shapeSelected.getDShapeModel().getY());
				}
				
			} catch(Exception v) {	
			
			}
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
				
		}	
		
	}	
}


