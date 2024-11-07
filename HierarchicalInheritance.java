
import java.util.Scanner;

class Employee {
  String name;
  int age;
  String phoneNumber;
  String address;
  double salary;

  Employee(String name, int age, String phoneNumber, String address, double salary) {
      this.name = name;
      this.age = age;
      this.phoneNumber = phoneNumber;
      this.address = address;
      this.salary = salary;
  }

  void printSalary() {
      System.out.println("Salary: " + salary);
  }
}

class Officer extends Employee {
  String specialization;

  Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
      super(name, age, phoneNumber, address, salary);
      this.specialization = specialization;
  }

  void displayOfficerDetails() {
      System.out.println("Officer Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Phone Number: " + phoneNumber);
      System.out.println("Address: " + address);
      printSalary();
      System.out.println("Specialization: " + specialization);
  }
}

class Manager extends Employee {
  String department;

  Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
      super(name, age, phoneNumber, address, salary);
      this.department = department;
  }

  void displayManagerDetails() {
      System.out.println("Manager Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Phone Number: " + phoneNumber);
      System.out.println("Address: " + address);
      printSalary();
      System.out.println("Department: " + department);
  }
}


public class HierarchicalInheritance {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Officer name");
      String name = sc.nextLine();

      System.out.println("Enter Officer age");
      int age = sc.nextInt();
      
      System.out.println("Enter Officer phoneNumber");
      String phoneNumber = sc.nextLine();

      System.out.println("Enter Officer address");
      String address = sc.nextLine();

      System.out.println("Enter Officer salary");
      double salary = sc.nextDouble();

      System.out.println("Enter Officer specialisation");
      String specialisation = sc.nextLine();

      Officer officer = new Officer(name, age, phoneNumber, address, salary, specialisation);

      Manager manager = new Manager("Bob", 40, "987-654-3210", "456 Elm St", 80000, "Sales");

      System.out.println("Officer Details:");
      officer.displayOfficerDetails();
      System.out.println();


      System.out.println("Manager Details:");
      manager.displayManagerDetails();
  }
}