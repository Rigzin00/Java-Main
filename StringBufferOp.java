// 22. Write a menu driven JAVA program to do the following string operations using ‘String’ and
// ‘stringBuffer’ class.
// (a) Insert a string in another string at a given position
// (b) Modify a character at a given position
// (c) Append a string


import java.util.Scanner;

public class StringBufferOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String originalString = "";
        StringBuffer stringBuffer = new StringBuffer();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a string at a given position");
            System.out.println("2. Modify a character at a given position");
            System.out.println("3. Append a string");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the original string: ");
                    originalString = sc.nextLine();

                    System.out.print("Enter the string to insert: ");
                    String insertString = sc.nextLine();

                    System.out.print("Enter the position to insert at (0-based index): ");
                    int insertPosition = sc.nextInt();
                    
                    if (insertPosition < 0 || insertPosition > originalString.length()) {
                        System.out.println("Invalid position!");
                    } else {
                        stringBuffer.append(originalString);
                        stringBuffer.insert(insertPosition, insertString);
                        System.out.println("Modified String using StringBuffer: " + stringBuffer.toString());
                    }
                    break;

                case 2:
                    System.out.print("Enter the string to modify: ");
                    String stringToModify = sc.nextLine();

                    System.out.print("Enter the position of the character to modify (0-based index): ");
                    int modifyPosition = sc.nextInt();

                    System.out.print("Enter the new character: ");
                    char newChar = sc.next().charAt(0);
                    
                    if (modifyPosition < 0 || modifyPosition >= stringToModify.length()) {
                        System.out.println("Invalid position!");

                    } else {
                        StringBuffer sb = new StringBuffer(stringToModify);
                        sb.setCharAt(modifyPosition, newChar);
                        System.out.println("Modified String using StringBuffer: " + sb.toString());
                    }
                    break;

                case 3:
                    System.out.print("Enter the string to append: ");
                    String appendString = sc.nextLine();

                    stringBuffer.append(appendString);
                    System.out.println("Appended String using StringBuffer: " + stringBuffer.toString());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


