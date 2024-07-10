import java.util.Scanner;
import java.util.UUID;
public class Student {
    String studentId;
    String regNo;
    String name;
    int age;
    String department;
    String address;
    String contactNumber;


    public void getDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        studentId = UUID.randomUUID().toString();
        System.out.println("======================= * ENTER STUDENT DETAILS * =======================");
        System.out.print("Registration Number: ");
        regNo = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Department: ");
        department = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Contact Number: ");
        contactNumber = sc.nextLine();
    }
}
