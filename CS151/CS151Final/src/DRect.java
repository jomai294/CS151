import java.awt.Graphics;


public class DRect extends DShapes {
		
		public DRect()
		{
				super();
				
				this.setModel(new DRectModel());
		}
		
		public void draw (Graphics g) {
			g.fillRect(getDShapeModel().getX(),getDShapeModel().getY(), 
					getDShapeModel().getWidth(), getDShapeModel().getHeight());
			g.setColor(getDShapeModel().getColor());
		}
}
