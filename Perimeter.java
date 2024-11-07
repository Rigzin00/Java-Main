// 17.Write a JAVA program to find perimeter of 2 rectangles using constructors.
// (Use Default constructor and Parameterized constructor to initialize values of length, breadth of 2
// rectangles respectively)

class Rectangle{
  double length;
  double breadth;

    Rectangle() {
      length = 2.5;
      breadth = 8;
    }
    Rectangle(double x,double  y){
      this.length = length;
      this.breadth = breadth;
    }
    double Perimeter(){
      return 2*(length + breadth);
    }
  
}


 class Perimeter {
  public static void main(String[] args) {
      Rectangle p1 = new Rectangle();
      Rectangle p2 = new Rectangle(4.0,5.0);

      System.out.print("Perimeter of rectangle" + p1.Perimeter());
      System.out.print("\nPerimeter of rectangle" + p2.Perimeter());
  }
}
