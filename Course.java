import java.util.Scanner;

public class Course {
    String courseId;
    String courseName;
    String instructor;
    int duration;
    int enrollment;

    public void getDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration (weeks): " + duration);
        System.out.println("Enrollment: " + enrollment + " students");
    }
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= * ENTER COURSE DETAILS * =======================");
        System.out.print("Course Name: ");
        courseName = sc.nextLine();
        System.out.print("Instructor: ");
        instructor = sc.nextLine();
        System.out.print("Course Duration (weeks): ");
        duration = sc.nextInt();
        System.out.print("Enrollment: ");
        enrollment = sc.nextInt();
    }
}
