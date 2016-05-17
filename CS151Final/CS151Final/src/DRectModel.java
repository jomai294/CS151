import java.awt.Color;


public class DRectModel extends DShapeModel{
		public DRectModel(int x, int y, int width , int height,Color color)
		{
				super.setX(x);
				super.setY(y);
				super.setWidth(width);
				super.setHeight(height);
				super.setColor(color);
		}
		
		public DRectModel() {
				super();
		}
		
}
