//Š A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;




class Halloween extends Canvas
{
   public Halloween()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE); 	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
     window.setColor(Color.BLACK);
     window.fillRect(0, 520, 800, 50);
     //H
     window.setColor(Color.ORANGE);
     window.fillRect(50, 100, 20, 80);
     window.fillRect(70, 130, 20, 20);
     window.fillRect(90, 100, 20, 80);
     //A
     
     window.fillRect(119, 120, 20, 60);
     window.fillRect(132, 100, 40, 20);
     window.fillRect(164, 120, 20, 60);
     window.fillRect(132, 135, 40, 15);
     //EYES
    
     //P
  
     window.setColor(Color.ORANGE);
     window.fillRect(192, 100, 20, 80);
     window.fillRect(212, 100, 30, 20);
     window.fillRect(230, 120, 20, 25);
     window.fillRect(212, 145, 25, 15);
     
     window.setColor(Color.WHITE);
     window.fillOval(188, 70, 36, 40);
     window.setColor(Color.WHITE);
     window.fillOval(216, 70, 36, 40);
     window.setColor(Color.BLACK);
     window.fillOval(192, 75, 28, 30);
     
     window.setColor(Color.BLACK);
     window.fillOval(220, 75, 28, 30);
     window.setColor(Color.WHITE);
     window.fillOval(225, 79, 10, 10);
     window.fillOval(197, 79, 10, 10);
     window.setColor(Color.RED);
     window.fillOval(199, 81, 6, 5);
     window.fillOval(227, 81, 6, 5);
     
     
     
     //p
     window.setColor(Color.ORANGE);
     window.fillRect(258, 100, 20, 80);
     window.fillRect(278, 100, 30, 20);
     window.fillRect(296, 120, 20, 25);
     window.fillRect(278, 145, 25, 15);
     //y
     window.fillRect(346, 120, 20, 60);
     window.fillRect(336, 120, 10, 20);
     window.fillRect(326, 110, 20, 20);
     window.fillRect(319, 100, 17, 20);
     window.fillRect(376, 100, 17, 20);
     window.fillRect(366, 110, 20, 20);
     window.fillRect(366, 120, 10, 20);
     //H
     window.setColor(Color.DARK_GRAY);
     window.fillRect(420, 100, 20, 80);
     window.fillRect(440, 130, 20, 20);
     window.fillRect(460, 100, 20, 80);
     //quote
     window.setColor(Color.BLACK);
     window.setFont(new Font("IMPACT", Font.BOLD,24));
     window.drawString("created by Cory Fink", 480, 205);
     //A
     window.setColor(Color.DARK_GRAY);
     window.fillRect(489, 120, 20, 60);
     window.fillRect(502, 100, 40, 20);
     window.fillRect(534, 120, 20, 60);
     window.fillRect(502, 135, 40, 15);
     //L
     window.fillRect(565, 100, 20, 80);
     window.fillRect(565, 160, 40, 20);
     //L
     window.fillRect(612, 100, 20, 80);
     window.fillRect(612, 160, 40, 20);
     //O
     window.setColor(Color.DARK_GRAY);
     window.fillOval(655, 100, 70, 80);
     window.setColor(Color.WHITE);
     window.fillOval(650, 105, 50, 60);
    
     
     //BUILDING
     window.setColor(Color.BLACK);
     window.fillRect(20, 200, 60, 360);
     window.setColor(Color.YELLOW);
     window.fillRect(30, 500, 15, 15);
     window.fillRect(55, 500, 15, 15);
     //row 2
     window.fillRect(30, 475, 15, 15);
     window.fillRect(55, 475, 15, 15);
     //row 3
     window.fillRect(30, 450, 15, 15);
     window.fillRect(55, 450, 15, 15);
     //row 4
     window.setColor(Color.DARK_GRAY);
     window.fillRect(30, 425, 15, 15);
     window.fillRect(55, 425, 15, 15);
     //row 5
     window.fillRect(30, 400, 15, 15);
     window.fillRect(55, 400, 15, 15);
     //row 6
     window.setColor(Color.YELLOW);
     window.fillRect(30, 375, 15, 15);
     window.fillRect(55, 375, 15, 15);
     //row 7
     window.setColor(Color.DARK_GRAY);
     window.fillRect(30, 350, 15, 15);
     window.fillRect(55, 350, 15, 15);
     //row 8
     window.setColor(Color.YELLOW);
     window.fillRect(30, 325, 15, 15);
     window.fillRect(55, 325, 15, 15);
     //row 9
     window.fillRect(30, 300, 15, 15);
     window.fillRect(55, 300, 15, 15);
     //row 10
     window.fillRect(30, 275, 15, 15);
     window.fillRect(55, 275, 15, 15);
     //row 11
     window.fillRect(30, 250, 15, 15);
     window.fillRect(55, 250, 15, 15);
     //row 12
     window.setColor(Color.BLACK);
     window.fillRect(30, 225, 15, 15);
     window.fillRect(55, 225, 15, 15);

     //BUILDING 3
     
     
     window.setColor(Color.BLACK);
     window.fillOval(82, 255, 90, 90);
     window.fillRect(119, 220, 13, 50);
     window.setColor(Color.YELLOW);
     window.fillOval(88, 261, 78, 70);
     window.setColor(Color.BLACK);
     window.fillRect(82, 300, 90, 220);
     
     //buliding 4
     window.fillRect(175, 360, 185, 190);
     window.setColor(Color.DARK_GRAY);
     window.fillRect(185, 500, 15, 15);
     window.fillRect(210, 500, 15, 15);
     window.fillRect(235, 500, 15, 15);
     window.fillRect(260, 500, 15, 15);
     window.fillRect(285, 500, 15, 15);
     window.fillRect(310, 500, 15, 15);
     window.fillRect(335, 500, 15, 15);
     //row 2
     window.fillRect(185, 475, 15, 15);
     window.fillRect(210, 475, 15, 15);
     window.fillRect(235, 475, 15, 15);
     window.setColor(Color.YELLOW);
     window.fillRect(260, 475, 15, 15);
     window.fillRect(285, 475, 15, 15);
     window.setColor(Color.DARK_GRAY);
     window.fillRect(310, 475, 15, 15);
     window.fillRect(335, 475, 15, 15);
     //row 3
     window.fillRect(185, 450, 15, 15);
     window.setColor(Color.YELLOW);
     window.fillRect(210, 450, 15, 15);
     window.setColor(Color.DARK_GRAY);
     window.fillRect(235, 450, 15, 15);
     window.fillRect(260, 450, 15, 15);
     window.fillRect(285, 450, 15, 15);
     window.fillRect(310, 450, 15, 15);
     window.fillRect(335, 450, 15, 15);
     //row 4
     window.fillRect(185, 425, 15, 15);
     window.fillRect(210, 425, 15, 15);
     window.fillRect(235, 425, 15, 15);
     window.fillRect(260, 425, 15, 15);
     window.fillRect(285, 425, 15, 15);
     window.fillRect(310, 425, 15, 15);
     window.fillRect(335, 425, 15, 15);
     //row 3
     window.fillRect(185, 400, 15, 15);
     window.fillRect(210, 400, 15, 15);
     window.fillRect(235, 400, 15, 15);
     window.fillRect(260, 400, 15, 15);
     window.fillRect(285, 400, 15, 15);
     window.fillRect(310, 400, 15, 15);
     window.fillRect(335, 400, 15, 15);
     //row 4
     window.fillRect(185, 375, 15, 15);
     window.fillRect(210, 375, 15, 15);
     window.fillRect(235, 375, 15, 15);
     window.setColor(Color.YELLOW);
     window.fillRect(260, 375, 15, 15);
     window.fillRect(285, 375, 15, 15);
     window.setColor(Color.DARK_GRAY);
     window.fillRect(310, 375, 15, 15);
     window.fillRect(335, 375, 15, 15);
     
     //building 5
     window.setColor(Color.BLACK);
     window.fillRect(365, 260, 100, 280);
     window.fillRect(470, 300, 100, 240);
     window.setColor(Color.DARK_GRAY);
     window.fillRect(480, 310, 80, 210);
     
     window.setColor(Color.BLACK);
     window.fillOval(575, 300, 200, 200);
     window.setColor(Color.DARK_GRAY);
     window.fillOval(595, 320, 160, 160);
     window.setColor(Color.BLACK);
     window.fillRect(575, 400, 200, 140);
     window.setColor(Color.BLACK);
     window.fillRect(585, 380, 180, 140);
     
     window.setColor(Color.WHITE);
     window.setFont(new Font("SHOWCARD GOTHIC", Font.BOLD,28));
     window.drawString("BEWARE", 606, 430);
     window.drawString("OF SNEAKY", 590, 457);
     window.setColor(Color.YELLOW);
     window.setFont(new Font("SHOWCARD GOTHIC", Font.BOLD,34));
     window.drawString("GHOSTS", 600, 495);
     
  

   }


public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
}
