import javax.swing.plaf.metal.OceanTheme;
import java.util.Scanner;

public class Lab504 {
    static boolean check_password(String pass){
        return pass.length() > 8;
    }
    static boolean check_password(String pass,String confirm_pass){
        return confirm_pass.equals(pass);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create password: ");
        String create_pass = sc.next();
        while (!check_password(create_pass)){
            System.out.print("Invalid Password! Create password: ");
            create_pass = sc.next();
        }
        System.out.print("\nEnter confirm password: ");
        String confirm_pass = sc.next();
        while (!check_password(create_pass,confirm_pass)){
            System.out.print("Password do not match! Enter confirm password: ");
            confirm_pass = sc.next();
        }
        System.out.println("\nPassword set successfully!!");
    }
}
