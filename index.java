int x = 100;
int y = 100;
int rectWidth = 200;
int rectWeight = 200;
int r = 150;
int g = 0;
int b = 0;


void setup() {
	size(300, 300);
  
}

void draw() { 
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  //background(255)
  stroke(0);
  
  
  fill( r, g, b)
rect(x, y, rectWidth, rectWeight);
fill((int) random(0, 255), (int) random(0, 255), (int)
 random(0,255));

   ellipse(mouseX + (int) random(-30, 30), mouseY + (int) random(-30, 30), 10, 10);
}

 