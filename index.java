void setup() {
	size(300, 300);
  
}
int x = 145;
int y = 150;
int d = 100;
void draw() {

int x = int(random(1,500));
int y = int(random(1,500));


// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  
  stroke(0);
  
  int r = (int) random(0, 255);
  int g = (int) random(0, 255);
  int b = (int) random(0, 255);

  fill( r, g, b)

   ellipse(x, y, d,d)

   
}

 void mousePressed(){
x = x-1
 }