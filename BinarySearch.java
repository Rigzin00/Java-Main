import java.util.Scanner;

public class BinarySearch {

static int BinaryCalc(int[] arr, int s ){
  int left = 0;
  int right = arr.length - 1;
  
  while (left <= right) {
    int mid = left + (right - left) / 2;
    
    if(arr[mid] == s){
      return mid;
    }
    else if(arr[mid] > s){
      right = mid -1;
    }else {
      left = mid + 1;
    }
  }
  return -1;
}


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];    
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    //bubble sort
    int temp;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if(arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }   
    }

    System.out.print("Enter the element to be searched for : ");
    int search = sc.nextInt();

    int result = BinaryCalc(arr ,search);

    if (result == -1){
      System.out.print("Target value "+ search+ " not found in the array");
    }else{
      System.out.print("Target value "+ search+ " not found in the array at index " + result);
    }
  }
}
