// 25. Array of Objects
// Write a JAVA program to display details of the required employee based on his Id. The details of 
// employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation, Emp_salary,Emp_Address etc.
// (create array of n objects and read values for each objects initially., then display details of the required employee based on his Id)

import java.util.Scanner;

class Employee{
  int Emp_ID;
  String Emp_name;
  int Emp_age;
  String Emp_gender;
  String Emp_designation;
  double Emp_salary;
  String Emp_Address;

  Employee (int Emp_ID,String Emp_name,int Emp_age,String Emp_gender, String Emp_designation,double  Emp_salary,String Emp_Address){
    this.Emp_ID = Emp_ID;
    this.Emp_name = Emp_name;
    this.Emp_age = Emp_age;
    this.Emp_gender = Emp_gender;
    this.Emp_designation = Emp_designation;
    this.Emp_salary = Emp_salary;
    this.Emp_Address = Emp_Address;
  }

  void displayDetails() {
    System.out.println("Employee ID: " + Emp_ID);
    System.out.println("Name: " + Emp_name);
    System.out.println("Age: " + Emp_age);
    System.out.println("Gender: " + Emp_gender);
    System.out.println("Designation: " + Emp_designation);
    System.out.println("Salary: " + Emp_salary);
    System.out.println("Address: " + Emp_Address);
    System.out.println("----------------------------------");
  }

  int getId() {
      return Emp_ID;
  }

  String getName() {
      return Emp_name;
  }

  int getAge() {
      return Emp_age;
  }

  String getGender() {
      return Emp_gender;
  }

  String getDesignation() {
      return Emp_designation;
  }

  double getSalary() {
      return Emp_salary;
  }

  String getAddress() {
      return Emp_Address;
}
}

class ArrayOfObjects {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of employees : ");
    int n = scanner.nextInt();
    
    //Array of object creation
    Employee[] obEmployee = new Employee[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter details for Employee " + (i + 1) + ":");

      System.out.print("ID: ");
      int id = scanner.nextInt();
      
      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Age: ");
      int age = scanner.nextInt();

      System.out.print("Gender: ");
      String gender = scanner.nextLine();

      System.out.print("Designation: ");
      String designation = scanner.nextLine();

      System.out.print("Salary: ");
      double salary = scanner.nextDouble();

      System.out.print("Address: ");
      String address = scanner.nextLine();

      // Create an Employee object and store it in the array
      obEmployee[i] = new Employee(id, name, age, gender, designation, salary, address);
    }
    System.out.print("Enter the employee ID to search for: ");
    int searchId = scanner.nextInt();

    boolean found = false;
        //for-each method
        //like for(int i : arr)
        for (Employee emp : obEmployee) {
            if (emp.getId() == searchId) {
                emp.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
  }
}
