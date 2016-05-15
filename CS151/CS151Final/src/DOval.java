import java.awt.Graphics;


public class DOval extends DShapes {
		public DOval()
		{
				super();
				this.setModel(new DOvalModel());
		}
		
		public void draw(Graphics g) {
			
				g.fillOval(getDShapeModel().getX(),getDShapeModel().getY(),
						getDShapeModel().getWidth(), getDShapeModel().getHeight());
				g.setColor(getDShapeModel().getColor());
		}
}
