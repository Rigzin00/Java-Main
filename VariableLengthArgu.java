// 32. Variable length arguments
//          Write a JAVA program to calculate the area of different shapes(circle, rectangle, triangle) using variable length arguments.

import java.util.Scanner;

public class VariableLengthArgu {
    static double calculateArea(String shape, double... dim) {
        switch (shape.toLowerCase()) {
            case "triangle":
                if (dim.length == 2) {
                    return dim[0] * dim[1] * 0.5; 
                }
                break;
            case "rectangle":
                if (dim.length == 2) {
                    return dim[0] * dim[1]; 
                }
                break;
            case "circle":
                if (dim.length == 1) {
                    return Math.PI * Math.pow(dim[0], 2);
                }
                break;
            default:
                System.out.println("Invalid Shape");
                return 0; 
        }
        throw new IllegalArgumentException("Invalid number of dimensions for " + shape + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = calculateArea("circle", radius);
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, circleArea);

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        double rectangleArea = calculateArea("rectangle", length, breadth);
        System.out.printf("The area of the rectangle with %.2f cm length and %.2f cm breadth is: %.2f%n", length, breadth, rectangleArea);

        // Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double triangleArea = calculateArea("triangle", base, height);
        System.out.printf("The area of the triangle with %.2f cm base and %.2f cm height is: %.2f%n", base, height, triangleArea);

}
}