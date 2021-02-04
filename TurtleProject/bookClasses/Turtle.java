package bookClasses;

import java.util.*;
import java.awt.*;
import java.util.Random;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 * Pushkar Betsur, Feb 1
 * *****You told us that it was okay if we did not do circle @mrhayes*****
 */

public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  Random randnum = new Random(); 
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture)
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y,
                 ModelDisplay modelDisplayer)
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }

  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay)
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }

  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
 
  }
  /**
   * Square - draw a square of n length
   * @param side length
   */

  public void drawsquare(int side)
  {
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);


  }
  /**
   * basically simulating a drunk dude strolling the streets
   */
  public void randomWalk (int steps, int turns)
  {
       int counter = 0;
       int turn; 
       while (counter  < turns)
       {
           counter += 1;
           turn = randnum.nextInt(3)+1; // possible num of directions
           if (turn == 1)
                turn(0);
           else if (turn == 2)
                turn(90);
           else if (turn == 3)
                turn(180);
           else if (turn == 4)
                turn(270);
           forward(steps);
        }
    }
  /**
   * @rec just draw a rectangle
   * @param height and width
   */
  public void drawrec (int height, int width )
  {
      forward(width);
      turn(90);
      forward(height);
      turn(90);
      forward(width);
      turn(90);
      forward(height);
      turn(90);
  }
  /**
   * this draws an equilateral triangle
   * @param - side is just the sides of the triangle
   */
  public void drawequilateralTriangle (int side)
  {
       forward(side); 
       turn(100);
       forward(side); 
       turn(100); 
       forward(side); 
       turn (100); 
       
  }
  /**
   * @param side length of all the sides of a hexagon
   */
  public void drawhex(int side)
  {
      forward(side);
      turn(60);
      forward(side);
      turn(60);
      forward(side);
      turn(60);
      forward(side);
      turn(60);
      forward(side);
      turn(60);
      forward(side);
      turn(60);
    }
   
    // Hey Mr. Hayes I remember you saying that we did not need to do circle. 
    
} // this } is the end of class Turtle, put all new methods before this