import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("Enter your full name:").trim();

       while(name.indexOf(" ") == -1){
           name = JOptionPane.showInputDialog("Enter your full name:").trim();
       }
       JOptionPane.showMessageDialog(null,"Welcome, " + name.toUpperCase().charAt(0) +
               name.substring(1,name.indexOf(" ")).toLowerCase() + name.substring(name.indexOf(" ")).toUpperCase());

    }
}
