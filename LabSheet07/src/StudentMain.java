public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Malee";
        s1.id = "25131110000";

        s1.showStatus();
        s1.doHomework(10);
        s1.showStatus();

        s1.doHomework(15);
        s1.showStatus();

        s1.takeExam(20);
        s1.showStatus();

        Student s2 = new Student();
        s2.name = "Tipco";

        s1.showStatus();
        s2.showStatus();
    }
}
