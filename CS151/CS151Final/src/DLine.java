import java.awt.Graphics;


public class DLine extends DShapes{

		public DLine() {
				super();
				
				this.setModel(new DLineModel());
				
				
		}
		
		public void draw(Graphics g) {
				g.drawLine(getDShapeModel().getX(), getDShapeModel().getY(), 
						getDShapeModel().getWidth(), getDShapeModel().getHeight());
		}
		
		
}
