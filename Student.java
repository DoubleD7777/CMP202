package User;

public class Student extends User {
    String matric_no = "bhu/22/04/05/0035";
    String admission_no = "302283749654";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result";
        } else {
            return "You got 7As and 2B";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Obinna Brown";
        student.password = "Double Dcode@123";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}
