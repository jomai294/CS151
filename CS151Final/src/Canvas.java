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
			for(int i = 0; i < d.getKnob().length; i++) {
				g.setColor(Color.BLACK);
				g.drawRect(d.getKnob()[i].x,d.getKnob()[i].y, 3, 3);
			}
		}
	}

	class Mouse implements MouseListener, MouseMotionListener {

		public void mouseClicked(MouseEvent e) {
			for (DShapes d : Shapes) {
				if (d.getBounds(e.getX(), e.getY())) {
					d.setBounds(e.getX(), e.getY());
					setShapeSelected(d);
					repaint();
					System.out.println("Mouse x is " + e.getX());
					System.out.println("Mouse y is " + e.getY());
					System.out.println("within shape");
				}
			}
		}
	
		public void mousePressed(MouseEvent e) {
			for (DShapes d : Shapes) {
				if (d.getBounds(e.getX(),e.getY())) {
					d.setBounds(e.getX(), e.getY());
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
				shapeSelected.getDShapeModel().setX(e.getX());
				shapeSelected.getDShapeModel().setY(e.getY());
				shapeSelected.setBounds(e.getX()- shapeSelected.getDShapeModel().getWidth()/2, e.getY()-shapeSelected.getDShapeModel().getHeight()/2);
				repaint();
			}catch( Exception v){	
			
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
				
		}		
	}	
}


