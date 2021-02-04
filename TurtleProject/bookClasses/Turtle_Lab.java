package bookClasses;

import java.util.*;
import java.awt.*;

/**
 * Pushkar Betsur 2-3-21
 * Create a picture using turtle methods
 */
public class Turtle_Lab
{
  public static void main (String[] args)
  {
     World test = new World(false);
     Turtle lab = new Turtle(test);
     // here i was just attempting to draw a basic house with a weird chimney and a door. im not too creative but i tried :)
     lab.drawrec(200,100); 
     lab.drawsquare(50);
     lab.forward(100);
     lab.drawequilateralTriangle(120);
     test.setVisible(true);
    }
  
    
    
}
