// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines

        Random rndInt = new Random(12345);
        for (int k = 1; k <= 100; k++)
        {
            int x1 = rndInt.nextInt(390);
            int y1 = rndInt.nextInt(300);
            int x2 = rndInt.nextInt(390);
            int y2 = rndInt.nextInt(300);
            g.drawLine(x1,y1,x2,y2);
        }

        // Draw Random Squares

            Random Int = new Random(12345);
            for (int k = 1; k <=100; k++)
            {
                int x1 = rndInt.nextInt();
                int y1 = rndInt.nextInt();
                int x2 = rndInt.nextInt();
                int y2 = rndInt.nextInt();
                g.drawRect(x1,y1,x2,y2);
            }

        // Draw Random Circles





        // Draw 3-D Box




    }

}



    
 