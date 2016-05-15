import java.awt.Color;


public class DShapeModel {
		private int x;
		private int y;
		private int width;
		private int height;
		private Color color;
		
		public DShapeModel()
		{
				x = 10;
				y = 10;
				width = 20;
				height = 20;
				
				color = Color.GRAY;
				
		}
		
		public DShapeModel(int x, int y, int width, int height, Color color) {
				this.x = x;
				this.y = y; 
				this.width = width;
				this.height = height;
				this.color = color;
		}
		public void setX(int x)
		{
				this.x = x;
		}
		
		public void setY(int y)
		{
				this.y = y;
		}
		
		public void setWidth(int w)
		{
				width = w;
		}
		
		public void setHeight(int h)
		{
				height = h;
		}
		
		public void setColor(Color color) {
				this.color = color;
		}
		public int getX()
		{
				return x;
		}
		
		public int getY()
		{
				return y;
		}
		
		public int getWidth()
		{
				return width;
		}
		
		public int getHeight()
		{
				return height;
		}
		
		public Color getColor()
		{
				return color;
		}
		
}
