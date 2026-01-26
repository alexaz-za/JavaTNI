import javax.swing.*;

public class Lab506 {
    static boolean is_prime_number(int number){
        int count = 0;
        for (int i = 1;i <= number;i++){
            if (number % i == 0)
                count++;
        }
        return count == 2;
    }
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

        JOptionPane.showMessageDialog(null,number + " is " + (is_prime_number(number)? "" : "NOT ") + "Prime number");
    }
}
