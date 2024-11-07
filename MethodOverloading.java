// 15. Area of different shapes using method overloading
// Write a JAVA program to calculate the area of different shapes namely circle, rectangle, and
// triangle using the concept of method overloading.


import java.util.Scanner;

class Shape{
  double Area(double radius){
    double circleArea = Math.PI * radius *radius;
    return circleArea;
  }
  
  int Area(int length ,int breadth){
    int rectangleArea = length *breadth;
    return rectangleArea;
  }

  double Area(double base ,double height){
    double triangeArea = 0.5 * base * height;
    return triangeArea;
  }
}


public class MethodOverloading {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius of circle : ");
    double radius = sc.nextDouble();
    Shape c = new Shape();
    double circleArea = c.Area(radius);
    System.out.printf("Area of the circle with radius %.2f : %.2f%n", radius, circleArea);

    System.out.print("Enter the length of rectangle : ");
    int length = sc.nextInt();
    System.out.print("Enter the breadth of rectangle : ");
    int breadth = sc.nextInt();
    int rectangleArea = c.Area(length,breadth);
    System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " : " + rectangleArea);

    System.out.print("Enter the base of triangle : ");
    double base = sc.nextDouble();
    System.out.print("Enter the height of triangle : ");
    double height = sc.nextDouble();
    double triangeArea = c.Area(base,height);
    System.out.printf("Area of the rectangle with base %.2f and height %.2f : %.2f\n", base, height,triangeArea);
  }
}
