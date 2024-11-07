

import java.util.Scanner;
public class RecursionFibonacci2 {
  static int fibonacci(int n){
    if(n <= 1){
      return n;
    }else{
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a index to generate Fibonacci series up to that index (1 based index ) : ");
    int n = sc.nextInt();
    for(int i = 0; i < n ; i++){
      int fib = fibonacci(i);
      System.out.print(fib + " "); 
    }
  }
}
