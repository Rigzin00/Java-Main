public class Exception {

  // Method that can throw an exception
  public static int divide(int numerator, int denominator) throws ArithmeticException {
      if (denominator == 0) {
          // Throw an exception if the denominator is zero
          throw new ArithmeticException("Cannot divide by zero.");
      }
      return numerator / denominator;//else it will return the value
  }

  public static void main(String[] args) {
      int num1 = 10;
      int num2 = 0; // Change this to a non-zero value to avoid exception

      try {
          // Attempt to divide num1 by num2
          int result = divide(num1, num2);
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          // Catch the exception and print the error message
          System.out.println("Exception caught: " + e);
      } finally {
          // This block will execute regardless of whether an exception occurred
          System.out.println("Finally block is always executed ");
      }

      // Another attempt with a different denominator
      num2 = 2; // Change to a valid denominator
      try {
          int result = divide(num1, num2);
          System.out.println("Result: " + result);
      } catch (ArithmeticException e) {
          System.out.println("Exception caught: " + e);
      } finally {
          System.out.println("Execution of the second try-catch block is complete.");
      }
  }
}



// public class Exception {

//   // Method that can throw an ArrayIndexOutOfBoundsException
//   public static int getElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
//       if (index < 0 || index >= array.length) {
//           // Throw an exception if the index is out of bounds
//           throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array of length " + array.length);
//       }
//       return array[index];
//   }

//   public static void main(String[] args) {
//       int[] numbers = {10, 20, 30, 40, 50};

//       // Test with a valid index
//       int validIndex = 2;
//       try {
//           int result = getElement(numbers, validIndex);
//           System.out.println("Element at index " + validIndex + ": " + result);
//       } catch (ArrayIndexOutOfBoundsException e) {
//           System.out.println("Exception caught: " + e.getMessage());
//       } finally {
//           System.out.println("Execution of the first try-catch block is complete.");
//       }

//       // Test with an invalid index
//       int invalidIndex = 5; // This index is out of bounds
//       try {
//           int result = getElement(numbers, invalidIndex);
//           System.out.println("Element at index " + invalidIndex + ": " + result);
//       } catch (ArrayIndexOutOfBoundsException e) {
//           System.out.println("Exception caught: " + e.getMessage());
//       } finally {
//           System.out.println("Execution of the second try-catch block is complete.");
//       }
//   }
// }
