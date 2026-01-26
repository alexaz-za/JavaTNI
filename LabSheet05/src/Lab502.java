import javax.swing.*;

public class Lab502 {
    static String find_grade(int score){
        if (score >= 80)
            return "A";
        else if (score >= 70)
            return "B";
        else if (score >= 60)
            return "C";
        else if (score >= 50)
            return "D";
        return "F";
    }
    static int cal_score(int midterm,int Final){
        return midterm + Final;
    }
    static int input_score(String message,int limit_score){
        int score = Integer.parseInt(JOptionPane.showInputDialog(message));
        while (score < 0 || score > limit_score){
            score = Integer.parseInt(JOptionPane.showInputDialog("Score must be in range between 0 and " + limit_score +"\n" + message));
        }
        return score;
    }
    public static void main(String[] args) {
        while (true){
            int option = JOptionPane.showConfirmDialog(null,"Do you want to check your score?","Check score",JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION){
                int midterm = input_score("Enter midterm-score:",45);
                int Final = input_score("Enter final-score:",55);

                JOptionPane.showMessageDialog(null,"Your score is " + cal_score(midterm,Final) +
                        "\nYou get grade " + find_grade(cal_score(midterm,Final)));
            }
            else {
                JOptionPane.showMessageDialog(null,"END PROGRAM!!");
                break;
            }
        }
    }
}
