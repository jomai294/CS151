import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;


public class DShapes {
		
		private DShapeModel model;
		private ArrayList<Point> listOfPoints;
		private Canvas canvas;
		public DShapes() {
				listOfPoints = new ArrayList<Point>();
				
		}
		
		public void draw(Graphics g)
		{
				if (this.getDShapeModel() instanceof DRectModel) {
						g.drawRect(this.getDShapeModel().getX(),this.getDShapeModel().getY(), this.getDShapeModel().getWidth(), this.getDShapeModel().getHeight());
				}
				else if (this.getDShapeModel() instanceof DOvalModel) {
						g.drawOval(this.getDShapeModel().getX(), this.getDShapeModel().getY(), this.getDShapeModel().getWidth(), this.getDShapeModel().getHeight());
				}
//				else if (this.getDShapeModel() instanceof DTextModel) {
//						g.d
//				}
//				else if (this.getDShapeModel() instanceof DLineModel) {
//						g.drawLine(x1, y1, x2, y2);
//				}
		}
		
		public void setDShapeModel(DShapeModel dsm)
		{
				model = dsm;
		}
		
		public DShapeModel getDShapeModel()
		{
				return model;
		}
		
		
		
}
