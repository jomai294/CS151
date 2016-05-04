import java.awt.Color;


public class DShapeModel {
		private int x;
		private int y;
		private int width;
		private int height;
		private Color color;
		
		public DShapeModel()
		{
				x = 0;
				y = 0;
				width = 0;
				height = 0;
				
				color = Color.GRAY;
				
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
