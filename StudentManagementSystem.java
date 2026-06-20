
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner input = new Scanner (System.in);
        while(true){
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("Exit");
            System.out.println("Enter choice: ");
            int choice = input.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.println("Enter ID");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter Name");
                    String name = input.nextLine();
                    System.out.println("Enter Age");
                    int age = input.nextInt();
                    service.addStudent( new Student(id,name,age));
                }
                case 2 -> service.viewStudents();
                case 3 -> {
                    System.out.println("Enter ID");
                    int searchID = input.nextInt();
                    service.searchStudent(searchID);
                }
                case 4 -> {
                    System.out.println("Enter ID");
                    int deleteID =input.nextInt();
                    service.deleteStudent(deleteID);
                }
                case 5 -> {
                    System.out.println("Exiting");
                    input.close();
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
