import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    static String hide_password(String password){
        String hide_password = "";
//        hide_password += password.charAt(0)
        for (int i=0; i<password.length();i++){
            if (i==0) hide_password += password.charAt(i);
            else if (i==password.length()-1) hide_password += password.charAt(i);
            else hide_password += "*";
        }
        return hide_password;
    }

    public static void main(String[] args) throws IOException {
        File filename = new File("src/users.txt");
        Scanner sc = new Scanner(filename);

        while(sc.hasNext()) {
//            String data = sc.nextLine();
            String[] data = sc.nextLine().split(",");
//            data[0] = username
//            data[1] = password
//            data[2] = gender
//            data[3] = birth year
            String username = data[0];
            String password = data[1];
            String gender = data[2];
            int birthyear = Integer.parseInt(data[3]);

            System.out.println("Username = " + username +
                    "\nPassword = " + hide_password(password) +
                    "\nGender   = " + gender +
                    "\nBirht year = " + birthyear + "\n");
        }

        sc.close();
    }
}
