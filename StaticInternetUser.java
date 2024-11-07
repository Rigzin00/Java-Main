// 26. Static variable, static functions and static block
// Write a JAVA program that creates a class called 'InternetUsers' for browsers of a college, which contain two static variables 'count'  with initial value=0 to keep track of number of internet users and  'happyCusfomers'. It also contain a final variable MAXTIME=2 hrs and string variable to store login name. class also contains a static method 'show' to display number of internet users and happy customers and a non static function 'compute' to increment and display the name of  happyCustomers if customer is happy. Also create a static block in your program to display a welcome message like 'Let's start browsing' and display maximum allotted time for browsing, it also initializes the static variable happyCustomers =count.


public class StaticInternetUser {

  //static variables
  static int count = 0;
  static int happyCustomers; 

  final static int MAXTIME = 2; 
  String loginName;

  //static block to display welcome messages
  static {
      System.out.println("Let's start browsing!");
      System.out.println("Maximum allotted time for browsing: " + MAXTIME + " hours");
      happyCustomers = count; //intially happycustomer = 0
  }

  
  StaticInternetUser(String loginName) {
      this.loginName = loginName;
      count++;
  }

  // Static method to show number of internet users and happy customers
  static void show() {
      System.out.println("Number of Internet Users: " + count);
      System.out.println("Happy Customers: " + happyCustomers);
  }

  // Non-static method (Normal method) to increment happyCustomers if the customer is happy
  void compute(boolean isHappy) {
      if (isHappy) {
          happyCustomers++;
          System.out.println(loginName + " is happy!");
      } else {
          System.out.println(loginName + " is not happy.");
      }
  }

  public static void main(String[] args) {

      StaticInternetUser user1 = new StaticInternetUser("Anees");
      user1.compute(true);
      
      StaticInternetUser.show();



      StaticInternetUser user2 = new StaticInternetUser("Rigzin");
      user2.compute(false); 

      StaticInternetUser.show();
  }
}
