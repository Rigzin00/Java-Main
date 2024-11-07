// 31. Single Inheritance & Super Keyword
// Write two Java classes Employee and Engineer. The Engineer class should inherit from the Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the engineer salary and to display from Employee class using a single object instantiation (i.e., only one object creation is allowed).
// ● display() only prints the name of the class and does not return any value. Ex. “ Name of the class is Employee.”
// ● calcSalary() in Employee displays “Salary of employee is 10000” and calcSalary() in Engineer displays
// “Salary of an employee is 20000.”


class Employee {

  void display() {
      System.out.println("Name of the class is Employee.");
  }

  void calcSalary() {
      System.out.println("Salary of employee is 10000.");
  }
}


class Engineer extends Employee {

  void calcSalary() {
      System.out.println("The salary of employee is given below :");
      super.calcSalary();
      
      System.out.println("This is the salary of engineer : ");
      System.out.println("Salary of an engineer is 20000.");
  }
}

public class SingleInheritanceSuperKeyword {
  public static void main(String[] args) {
      Engineer engineer = new Engineer();

      engineer.display();

      engineer.calcSalary();
  }
}
