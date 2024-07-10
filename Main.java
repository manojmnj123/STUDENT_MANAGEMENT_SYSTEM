import java.util.Scanner;

public class Main {

    static void mainMenu() {
        System.out.println();
        System.out.println("======================= * WELCOME TO STUDENT MANAGEMENT SYSTEM * =======================");
        System.out.println();
        System.out.println("1]. Add Student\t\t\t2]. Add Course");
        System.out.println("3]. Display Students\t\t4]. Display Courses");
        System.out.println("0]. Exit");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];
        Course[] courses = new Course[10];
        int studentCounter = 0;
        int courseCounter = 0;
        int choice;

        do {
            mainMenu();
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (studentCounter < students.length) {
                        students[studentCounter] = new Student();
                        students[studentCounter].setDetails();
                        studentCounter++;
                    } else {
                        System.out.println("Student storage is full.");
                    }
                    break;
                case 2:
                    if (courseCounter < courses.length) {
                        courses[courseCounter] = new Course();
                        courses[courseCounter].setDetails();
                        courseCounter++;
                    } else {
                        System.out.println("Course storage is full.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < studentCounter; i++) {
                        students[i].getDetails();
                    }
                    break;
                case 4:
                    for (int i = 0; i < courseCounter; i++) {
                        courses[i].getDetails();
                    }
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice, please enter again!");
            }
        } while (choice != 0);
    }
}
