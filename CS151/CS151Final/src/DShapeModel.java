import java.awt.Color;
import java.util.ArrayList;


public class DShapeModel implements ModelListener {
		private int x;
		private int y;
		private int width;
		private int height;
		private Color color;
		private ArrayList<ModelListener> list;
		
		public DShapeModel()
		{
				list = new ArrayList<ModelListener>();
				x = 10;
				y = 10;
				width = 20;
				height = 20;
				
				color = Color.RED;
				
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

		@Override
		public void modelChanged(DShapeModel model) {
			// TODO Auto-generated method stub
				//model = new DShapeModel(x,y,width,height,color);
		}
		
		public void addListener(ModelListener m) {
				list.add(m);
		}
		
		public void removeListener(ModelListener m) {
				list.remove(m);
		}
		
}
