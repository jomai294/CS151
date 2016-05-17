import java.awt.Graphics;


public class DOval extends DShapes {
		public DOval()
		{
				super();
				this.setDShapeModel(new DOvalModel());
		}
		
		public void draw(Graphics g) {
				
				g.setColor(getDShapeModel().getColor());
				g.fillOval(getDShapeModel().getX(),getDShapeModel().getY(),
						getDShapeModel().getWidth(), getDShapeModel().getHeight());
				
				
		}
}
