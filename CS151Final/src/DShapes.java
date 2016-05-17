import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class DShapes {
		
	private DShapeModel model;
	private int[] listOfPoints;
	private Point[] knob;
	private ArrayList<Integer> knobs;
	
	public DShapes() {
		listOfPoints = new int[4];
		knob = new Point[4]; 
		knobs = new ArrayList<Integer>();
	}
		
	public void draw(Graphics g) {
	}
		
	public void setDShapeModel(DShapeModel m) {
		model = m;		
	}
		
	public DShapeModel getDShapeModel() {
		return model;
	}
	
	public void setShapeSelected(DShapeModel m) {
		model = m;
	}	

	public DShapeModel getShapeSelected() {
		return model;	
	}
		
	public void setBounds(int x, int y) {
		model.setX(x);
		model.setY(y);
	}
	
	public boolean getBounds(int x, int y) {
		
		listOfPoints[0] = model.getX();
		listOfPoints[1] = model.getY();
		listOfPoints[2] = model.getWidth() + model.getX();
		listOfPoints[3] = model.getHeight() + model.getY();
		
		if (listOfPoints[0] <= x && listOfPoints[1] <= y && listOfPoints[2] >= x && listOfPoints[3]  >= y ) {
			return true;
		}
		return false;
	}
	
	public ArrayList<Integer> getKnobs() {
		knobs.add(listOfPoints[0]-3);
		knobs.add(listOfPoints[1]-3);
		knobs.add(listOfPoints[2]);
		knobs.add(listOfPoints[1]-3);
		knobs.add(listOfPoints[0]-3);
		knobs.add(listOfPoints[3]);
		knobs.add(listOfPoints[2]);
		knobs.add(listOfPoints[3]);
		return knobs; 
	}
	
	public Point[] getKnob() {
		knob[0] = (new Point(listOfPoints[0]-3, listOfPoints[1]-3));
		knob[1] = (new Point(listOfPoints[2], listOfPoints[1]-3));
		knob[2] = (new Point(listOfPoints[0]-3, listOfPoints[3]));
		knob[3] = (new Point(listOfPoints[2], listOfPoints[3]));
		return knob;
	}
}


