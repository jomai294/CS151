import java.awt.Color;


public class DTextModel extends DShapeModel{
		
		public DTextModel() {
				super();
		}
		
		public DTextModel(int x, int y, int width, int height, Color color) {
			super.setX(x);
			super.setY(y); 
			super.setWidth(width);
			super.setHeight(height);
			super.setColor(color);
		}

}
