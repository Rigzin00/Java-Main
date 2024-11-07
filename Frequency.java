// 18. Frequency of a given character
// Write a Java Program to find the frequency of a given character in a string.


import java.util.Scanner;

public class Frequency {
  public static void main(String args[]){

    Scanner sc = new Scanner((System.in));
    System.out.println("enter the string : ");
    String str = sc.nextLine();
    System.out.println("enter the next character");
    char x = sc.nextLine().charAt(0);
    int fre = 0;
    for (int i = 0; i < str.length(); i++) {
      if (x == str.charAt(i)){
        fre++;
      }
      
    }
    System.out.println(fre);
  }
}
