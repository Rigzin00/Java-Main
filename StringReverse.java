// 20. Write a Java program to reverse a given string.

import java.util.Scanner;
public class StringReverse {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = sc.nextLine();
    String rev = "";
    char ch ;
    for(int i = str.length() - 1 ; i >= 0 ;i--){
      ch = str.charAt(i);
      rev += ch;
    }
    System.out.println("Reversed String is : " + rev);
  }
}
