import java.util.ArrayList;
public class StudentService {
    ArrayList<Student>students = new ArrayList<>();
    void addStudent (Student s){
        students.add(s);
        System.out.println("Student added!");
    }
    void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students found!");
            return;
        }
        for( Student s : students){
            s.display();
        }
    }
    void searchStudent(int id){
        boolean found = false;
        for(Student s : students){
            if(s.id == id){
                s.display();
                found = true;
                break;
            }
        }
        if(!found){
        System.out.println("Student not found!");
    }
    }
    void deleteStudent(int id){
        boolean removed = students.removeIf(s -> s.id == id);
        if(removed){
            System.out.println("Deleted");
        }
        else{
            System.out.println("Not Found");
        }
    }
}

