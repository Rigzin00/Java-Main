// 16. Design a class to represent a bank account.
// Include the following members:
// Data members:
// Name of the depositor
// Account number
// Type of account
// Balance amount in the account.

// Methods:
// To assign initial values
// To deposit an amount
// To withdraw an amount after checking balance
// To display the name and balance



import java.util.Scanner;

class Bank{
  String name ;
  int accno;
  String acctype;
  double balance;
  
  void initialize () {
    name = "joe biden";
    accno = 123456;
    acctype = "Savings";
    balance = 123.12;
  }

  void deposit(double deposit)
  {
    balance += deposit;
    System.out.println("the available balance is : "+ balance);
  }

  void withdraw (double withdraw )
  {
    if (withdraw >= balance) {
        System.out.println("Insufficient balance ");
    }
    else
    {
      balance -= withdraw;
      System.out.println("the available balance is : "+ balance);
    }
  }
  void display()
  {
    System.out.println("name: " + name);
    System.out.println("the available balance is : " + balance);
  }
}

public class BankAccount {
  public static void main(String[] args) {
  
    Bank ob = new Bank();
    Scanner sc = new Scanner(System.in);
    ob.initialize();
    System.out.println("enter the deposit amount : ");
    double deposit = sc.nextDouble();
    ob.deposit(deposit);
    System.out.println("enter the withdraw amount : ");
    double withdraw = sc.nextDouble();
    ob.withdraw(withdraw);
    ob.display();
  }  
}
