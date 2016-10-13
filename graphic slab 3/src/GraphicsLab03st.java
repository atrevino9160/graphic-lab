 // GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		Random rnd = new Random(1234);
		
		
		// Draw Random Lines
		Random rndInt = new Random(1234);
		for (int k = 1; k <=100; k++)
		{
			int x1 = rndInt.nextInt(390)+10;
			int y1 = rndInt.nextInt(290)+10;
			int x2 = rndInt.nextInt(390)+10;
			int y2 = rndInt.nextInt(290)+10;
			g.drawLine(x1, y1, x2, y2);
			
			int red = rndInt.nextInt(250);
			int green = rndInt.nextInt(250);
			int blue = rndInt.nextInt(250);
			
			g.setColor(new Color (red,green,blue));
		}

		
		// Draw Random Squares

		for (int k = 1; k <= 100; k++)
		{
			int x = rndInt.nextInt(300)+420;
			int y = rndInt.nextInt(240)+10;
			
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);
			
			g.setColor(new Color (red,green,blue));
			g.fillRect(x,  y,  50,  50);
			
			
		}


		
		// Draw Random Circles




		
		// Draw 3-D Box
	
	
	
	
	
	}
		
}



    
 