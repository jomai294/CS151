import java.awt.Graphics;


public class DText extends DShapes{

		public DText()
		{
				super();
				
				this.setModel(new DTextModel());
		}
		
		public void draw(Graphics g) {
				//g.drawString(str, x, y);
		}
}
