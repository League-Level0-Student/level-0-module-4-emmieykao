
PImage face;

void setup() {
  face=loadImage("bigeyedpup.png");
      size(800,600);
    face.resize(width,height);
}

void draw() {
  background(face);
  System.out.println(mouseX);
  System.out.println(mouseY);
  if(mouseX>230){
    mouseX=230;}
  else if(mouseX<144){
  mouseX=144;}
  if(mouseY<80){
    mouseY=80;};
     if(mouseY>165){
       mouseY=165;};
  fill(255,255,255);
  ellipse(361,114,175,140);
  fill(0,0,0);
  ellipse(mouseX+179,mouseY-6,50,40);
  fill(255,255,255);
  ellipse(182,120,155,140);
  fill(0,0,0);
  ellipse(mouseX,mouseY,50,40);
  
}
