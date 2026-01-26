import java.util.Scanner;

public class Ex603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many member in your group: ");
        int member = sc.nextInt();
        String[] names = new String[member];

        for (int i = 0 ; i < member;i++){
            System.out.print("Enter name of member " + (i+1) + ": ");
            names[i] = sc.next();
        }
        int i = 1;
        for (String name : names){
            System.out.println(i++ + ") " + name);
        }
    }
}
