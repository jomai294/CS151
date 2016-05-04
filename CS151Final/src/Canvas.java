import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Canvas extends JPanel
{
		ArrayList<DShapes> listOfShapes;
		
		public Canvas()
		{
				listOfShapes = new ArrayList<DShapes>();
				super.setSize(400,400);
				super.setVisible(true);
				JButton button = new JButton("Rectangle");
				button.setPreferredSize(new Dimension(150,100));
				super.add(button);
				
				JButton button2 = new JButton("Oval");
				button2.setPreferredSize(new Dimension(150,100));
				super.add(button2);
				
				JButton button3 = new JButton("Line");
				button3.setLayout(null);
				button3.setPreferredSize(new Dimension(150,100));
				super.add(button3);
				
				
				
		}
		
		public void painComponent()
		{
				for (DShapes ds : listOfShapes)
				{
						System.out.println(ds);
				}
		}
		
		public void draw()
		{
				for (DShapes d : listOfShapes)
				{
						System.out.println(d);
				}
		}
		
		public void addShape(DShapeModel d)
		{
				if (d instanceof DRectModel)
				{
						listOfShapes.add(new DRect());
				}
				else if (d instanceof DOvalModel)
				{
						listOfShapes.add(new DOval());
				}
				
				else if (d instanceof DLineModel)
				{
						listOfShapes.add(new DLine());
				}
				else if (d instanceof DTextModel)
				{
						listOfShapes.add(new DText());
				}
				
				
				
				
				
		}
		
		
}
