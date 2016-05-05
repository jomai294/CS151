import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Canvas extends JPanel
{
		private ArrayList<DShapes> listOfShapes;
		private DShapeModel model;
		
		public Canvas() {
			model = new DShapeModel();
			listOfShapes = new ArrayList<DShapes>();
			super.setSize(400,400);
			super.setLayout(new BorderLayout());
			super.setVisible(true);
			super.setBackground(Color.white);
			
		
		}
		
		
		public void paintComponent(Graphics g) {
				for (DShapes ds : listOfShapes) {
						//ds.draw(g);	
				}
		}
		
//		public void draw()
//		{
//				for (DShapes d : listOfShapes)
//				{
//						d.draw(getGraphics());
//						
//				}
//		}
		
		public void addShape(DShapeModel d)
		{
				if (d instanceof DRectModel)
				{
						DShapes rect = new DRect();
						listOfShapes.add(rect);
				}
				else if (d instanceof DOvalModel)
				{
						DShapes oval = new DOval();
						listOfShapes.add(oval);
				}
				
				else if (d instanceof DLineModel)
				{
						DShapes line = new DLine();
						listOfShapes.add(line);
				}
				else if (d instanceof DTextModel)
				{
						DShapes text = new DText();
						listOfShapes.add(text);
				}
				
				
		}
		//for testing only
		public int getArrSize() {
				return listOfShapes.size();
		}
		
		
}
