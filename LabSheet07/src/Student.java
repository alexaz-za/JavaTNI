public class Student {
    String name;
    String id;
    int score = 0;
    void doHomework(int point){
        score += point;
        System.out.println(name + " did homework " + score + " points");
    }
    void takeExam(int point){
        score += point;
        System.out.println(name + " took exam " + score + " points");
    }
    String getResult(){
        return (score >= 50)?"PASS":"FAIL";
    }
    void showStatus(){
        System.out.println("Name      : " + name +
                         "\nStudent ID: " + id +
                         "\nScore     : " + score +
                         "\nResult    : " + getResult() +
                "\n----------------------------");
    }
}
