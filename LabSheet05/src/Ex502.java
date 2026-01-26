import javax.swing.*;

public class Ex502 {
    public static int input_score(String message,int limit_score){
        int score = Integer.parseInt(JOptionPane.showInputDialog(message));
        while (score < 0 || score > limit_score){
            score = Integer.parseInt(JOptionPane.showInputDialog("Score must be in range between 0 and " + limit_score +"\n" + message));
        }
        return score;
    }
    public static int cal_score(int midterm,int Final){
        return midterm + Final;
    }
    public static boolean is_pass(int score){
        return score >= 50;
    }
    public static void main(String[] args) {
        int midterm = input_score("Enter midterm score: ",35);
        int Final = input_score("Enter final score: ",65);

        JOptionPane.showMessageDialog(null,"Your score is " + cal_score(midterm,Final) +
                "\nYour result is " + (is_pass(cal_score(midterm,Final))?"Pass":"Fail"));
    }
}
