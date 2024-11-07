
import java.util.Scanner;

public class NoNeed {
 public static void main(String[] args) {
  int arr[]  = new int[5];
  Scanner sc = new Scanner(System.in);
  for (int i = 0; i < 5; i++) {
      arr[i] =sc.nextInt();
  }
  for (int i = 2; i < 4; i++) {
      arr[i] = arr[i+1];
  }
  arr[4] = 0;
  for (int i = 0; i < 5; i++) {
    System.out.println(arr[i]);
}
 } 
}
