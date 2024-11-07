
import java.util.Scanner;

class MyException extends Exception{

    public MyException(String msg) {
      super(msg);
    }
  
}

public class UserException {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Array : ");
    int n = sc.nextInt();
    int[] arr = new int[n]; 
    for(int i = 0 ; i < n; i++){
      arr[i] = sc.nextInt();
    }
    try{
      for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                // System.out.println("Duplicate found: " + j);
                throw new MyException("Duplicate found");
            }
        }
      }
    }catch (MyException e) {
      System.out.println("Exception caught: " + e);
    }catch (NumberFormatException e) {
      System.out.println("Please enter a valid integer.");
      }
  }  
}
