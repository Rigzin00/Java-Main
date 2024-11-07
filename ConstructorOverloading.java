// 24. Constructor Overloading
// Create a class named 'Patient' that includes an ID number, age, and BloodData. Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to  B+.  Create  an overloaded  constructor  that  provides  values  for each field.  Also provide get methods for each field.  Create another class 'TestPatient' that demonstrates that each method works correctly.


class Patient{
  int IDnumber;
  int age;
  String BloodData;

  // Default constructor
  Patient(){
    IDnumber = 0;
    age = 0;
    BloodData = "B+";
  }

  // Overloaded constructor
  Patient(int id, int age, String BloodData) {
    IDnumber = id;
    this.age = age;
    this.BloodData = BloodData;
  }

  int getID(){
    return IDnumber;
  }

  int getAge(){
    return age;
  }

  String getBloodData(){
    return BloodData;
  }
}

class ConstructorOverloading {
  public static void main(String[] args) {
    // Testing the default constructor
    Patient patient1 = new Patient();
    System.out.println("Patient 1: ");
    System.out.println("ID: " + patient1.getID());
    System.out.println("Age: " + patient1.getAge());
    System.out.println("Blood Data: " + patient1.getBloodData());
    
    System.out.println("\n");

    // Testing the overloaded constructor
    Patient patient2 = new Patient(123456,46,"0+");
    System.out.println("Patient 2: ");
    System.out.println("ID: " + patient1.getID());
    System.out.println("Age: " + patient1.getAge());
    System.out.println("Blood Data: " + patient1.getBloodData());
  }  
}
