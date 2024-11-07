// 11. Prime  number or not

// Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;

class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int n = sc.nextInt();
    
    int flag = 0;
    int m = n/2 ;
    
    if(n == 1 || n == 0){
      System.out.print(n +" is not a prime number ");
    } else 
    {
      //
      for(int i = 2; i <= Math.sqrt(n); i++)
        {
          if((n % i) == 0){
            flag = 1;
            break;
          }
        }

        if(flag == 0){
          System.out.println(n + " is a prime number  ");
        }else{
          System.out.print(n + " is not a prime number ");
        }
    }
    
    
    
  }
}
