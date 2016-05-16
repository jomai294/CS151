import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;


public class DShapes {
		
		private DShapeModel model;
		private ArrayList<Integer> listOfPoints;
		
		
		public DShapes() {
				listOfPoints = new ArrayList<Integer>();
				model = new DShapeModel();
		}
		
		public void draw(Graphics g)
		{
				
				
		}
		
		public void setModel(DShapeModel m)
		{
			   this.model = m;
				
		}
		
		public DShapeModel getDShapeModel()
		{
				return model;
		}
		
		public void setBounds(int x, int y) {
				model.setX(x);
				model.setY(y);
				
		}
		
		public boolean getBounds(int x, int y) {
				listOfPoints.add(model.getX());
				listOfPoints.add(model.getY());
				listOfPoints.add(model.getWidth() + model.getX());
				listOfPoints.add(model.getHeight() + model.getY());
				
				if (listOfPoints.get(0) <= x && listOfPoints.get(1) <= y && listOfPoints.get(2) >= x - 2 && listOfPoints.get(3) + 2  >= y ) {
						//System.out.println("The shape is on " + listOfPoints.get(3));
						return true;
				}
				
				return false;
		}
		
		
}
