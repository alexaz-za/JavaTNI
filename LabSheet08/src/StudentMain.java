import java.util.Scanner;

public class StudentMain {
    static void showInfo(Student st){
        System.out.println("Name : " + st.getName() +
                "\nYear : " + st.getStudy_year() +
                "\nScore: " + st.getScore() +
                "\nGrade: " + st.getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name  : ");
        student.setName(sc.next());
        System.out.print("Enter student year  : ");
        student.setStudyYear(sc.nextInt());
        System.out.print("Enter mid-term score: ");
        student.addPoint(sc.nextInt());
        System.out.print("Enter final score   : ");
        student.addPoint(sc.nextInt());
        System.out.println("-------------------------------");

        showInfo(student);
    }
}
