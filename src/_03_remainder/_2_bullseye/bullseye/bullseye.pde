void setup() {
  // set the size of your sketch
  size(500, 500);
}
void draw() {
  int w = 500;
  int h = 500;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i=0; i<9; i++) {
    fill(0, 0, 0);
    if (i % 2 == 0) { 
      fill(255, 0, 0);
    }
    ellipse(250, 250, w, h);
    w = w - 55;
    h = h - 55;
  }
  //Use an if statement and remainder to alternate the color of your rings.
}
