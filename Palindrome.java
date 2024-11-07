// 19. Palindrome String or not
// Write a Java program that checks whether a given string is a palindrome or not.
// Ex: MALAYALAM is palindrome.


import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    int flag = 0 ;
    Scanner sc = new Scanner(System.in);  
    String str = sc.nextLine();
    int l = str.length();
    for (int i = 0; i < l/2; i++) {
        if(str.charAt(i) != str.charAt(l-i-1)){
          flag = 1;
          break;
        }
    }
    if(flag == 0){
      System.out.println("String is palindrome");
    }else{
      System.out.println("not palindrome");
    }
  }
}
