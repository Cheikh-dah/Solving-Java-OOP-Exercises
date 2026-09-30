/*
 Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle. 
*/

public class Rectangle {
  private double width;
  private double height;

  //Constructor:
  public Rectangle (double width, double height){
    this.width = width;
    this.height = height;
  }

  //getter:
  public double getWidth(){
  // System.out.println(width);
  return width;
  }

  public double getHeight(){
  // System.out.println(height);
  return height;
  }

  //setters:
  public void setWidth(double width){
  this.width = width;
  }

  public void setHeight(double height){
  this.height = height;
  }

  //A methode that print Area:
  public double getArea(){
  return (height * width);
  }
  
  public double getPerimeter() {
    return 2 * (height + width);
  }
  
  public static void main (String[] args) {
    
    Rectangle rectangle1 = new Rectangle(4, 3);
    Rectangle rectangle2 = new Rectangle(5, 5);
    
    //Let's see the rectangles width and height infos:
    System.out.println("Rectangle 1 Width: " + rectangle1.getWidth());
    System.out.println("Rectangle 1 Height: " +rectangle1.getHeight());
    System.out.println("Rectangle 2 Width: " + rectangle2.getWidth());
    System.out.println("Rectangle 2 Height: " + rectangle2.getHeight());

    //Let's see the Area & Surface:
    System.out.println("Rectangle 1 Area: " + rectangle1.getArea());
    System.out.println("Rectangle 1 Perimeter: " + rectangle1.getPerimeter());
    System.out.println("Rectangle 2 Area: " + rectangle2.getArea());
    System.out.println("Rectangle 2 Perimeter: " + rectangle2.getPerimeter());
    
  }
  
}













