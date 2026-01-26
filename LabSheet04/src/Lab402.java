import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String stu_id;
        while (true){
            stu_id = JOptionPane.showInputDialog("Enter student-id:");

            if (stu_id != null&&stu_id.length() == 10){
                break;
            }
        }
        String majorcode = stu_id.substring(2,5),major;

        switch (majorcode){
            case "131":
                JOptionPane.showMessageDialog(null,"Student ID: " + stu_id +
                        "\nMajor: Information Technology (IT)");
                break;
            case "132":
                JOptionPane.showMessageDialog(null,"Student ID: " + stu_id +
                        "\nMultimedia Technology (MT)");
                break;
            case "133":
                JOptionPane.showMessageDialog(null,"Student ID: " + stu_id +
                        "\nDigital Business Information Technology (BI)");
                break;
            case "134":
                JOptionPane.showMessageDialog(null,"Student ID: " + stu_id +
                        "\nDigital Technology in Mass Communication (DC)");
                break;
            case "135":
                JOptionPane.showMessageDialog(null,"Student ID: " + stu_id +
                        "\nData Science and Data Analytics (DS)");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Cannot found major");
        }
    }
}
