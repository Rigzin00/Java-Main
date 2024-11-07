// 12. Second smallest element in an array

// Write a JAVA program to find the second smallest element in an array.


import java.util.Scanner;
public class SecondSmallest {
  public static void main(String[] args) {
      int i ;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the no of elements you want to store : ");
      int n = sc.nextInt();

      System.out.println("Enter array");
      int[] arr = new int[n];
      for ( i = 0 ; i < n ; i++) {          
      arr[i] = sc.nextInt();
      }
      
      System.out.println("Entered array : ");
      for ( i = 0 ; i < n ; i++) {          
        System.out.print(arr[i] + "\t"); 
        }
      System.out.println("\n");

      int temp;
      for( i =0 ;i < n-1 ;i++ ){
        for(int j = 0; j < n-i-1 ; j++){
          if(arr[j] > arr[j + 1]){
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
      
      System.out.println("sorted array : ");
      for ( i = 0 ; i < n ; i++) {          
        System.err.print(arr[i] + "\t"); 
        }
      System.out.println("\n");
      System.out.println("Second smallest element is : " + arr[1]);
        
  }
}
