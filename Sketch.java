/**
 * A program that uses loop patterns to draw sequences of objects in four quadrants
 * @author: A. Ng
 */

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	

  public void settings() {
	// put your size call here
    size(400, 400);
  }


  public void setup() {
    background(255);
  }


  public void draw() {
	  
	
    // quadrant 1

    for (int x = 1; x <= 10; x++) {
      int lineX = x * height / 20;
      line(lineX, 0, lineX, height / 2);
    }

    for (int y = 1; y <= 10; y++) {
      int lineY = y * width / 20;
      line(0, lineY, width / 2, lineY);
    }
    
    // quadrant 2

    fill(200, 40, 110);
    for (int circleX = (width / 2) + (width / 12); circleX <= width - (width / 12); circleX += (width / 12)) {
      for (int circleY = (height / 12); circleY <= (height / 12) * 5; circleY += (width / 12)) {
      ellipse(circleX, circleY, width / 21, height / 21);
      }
    }

    // quadrant 3

    for (int i=0; i <= height / 2; i++ )  {
      line (i, width / 2, i, height);
      stroke (i + 45, i + 45, i + 45);
      noLoop();
    }
    
    // quadrant 4

    stroke(0);
    fill(230,120,30);
    for (int i = 0; i <= 360; i += 45)  {
      pushMatrix();
      translate(width* 3/4, height * 3/4);
      rotate(radians(i));
      ellipse(0, 0, width / 25, height * 2 /7); 
      popMatrix();
    }
    
    noStroke();
    fill(20, 150, 20);
    ellipse((float) (width/2 + width/4), (float) (height/2 + height/4), (float) (width/12), (float) (height/12));

    
  }
  

}