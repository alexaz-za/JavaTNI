import javax.swing.*;
import java.util.Scanner;

public class StudentMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] st = new Student[3];

        for (int i = 0 ; i< st.length;i++){
            st[i] = new Student();
            st[i].name = JOptionPane.showInputDialog("Enter student name:");
            //System.out.print("Enter student id  : ");
            st[i].id = JOptionPane.showInputDialog("Enter student id:");
            //System.out.print("Enter homework score: ");
            //int homework_score = Integer.parseInt(JOptionPane.showInputDialog("Enter homework score:"));
            st[i].doHomework(Integer.parseInt(JOptionPane.showInputDialog("Enter homework score:")));
            //System.out.print("Enter exam score: ");
            st[i].takeExam(Integer.parseInt(JOptionPane.showInputDialog("Enter exam score:")));
        }

        for (Student s : st){
            System.out.println();
            s.showStatus();
        }
    }
}
