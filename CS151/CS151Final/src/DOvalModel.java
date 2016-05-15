import java.awt.Color;


public class DOvalModel extends DShapeModel{
		
		public DOvalModel()
		{
				super();
		}
		public DOvalModel(int x, int y, int width, int height, Color color) {
			super.setX(x);
			super.setY(y); 
			super.setWidth(width);
			super.setHeight(height);
			super.setColor(color);
		}
}
