import java.awt.Graphics;


public class DRect extends DShapes {
		
		public DRect()
		{
				super();
				
				this.setDShapeModel(new DRectModel());
		}
		
		public void draw (Graphics g) {
			g.setColor(getDShapeModel().getColor());
			g.fillRect(getDShapeModel().getX(),getDShapeModel().getY(), 
					getDShapeModel().getWidth(), getDShapeModel().getHeight());
			
			
		}
}
