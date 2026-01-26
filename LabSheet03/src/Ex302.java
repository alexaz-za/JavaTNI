import java.util.Scanner;

public class Ex302 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mid-term score: ");
        int midterm = scan.nextInt();
        System.out.print("Enter final    score: ");
        int finalterm = scan.nextInt();

        int total_score = midterm + finalterm;
        System.out.println("\nYour score is " + total_score);

        if (total_score < 0 || total_score > 100) System.out.println("Error score!!");
        else {
            if (total_score >= 80)
                System.out.println("You get grade A");
            else if (total_score >= 70)
                System.out.println("You get grade B");
            else if (total_score >= 60)
                System.out.println("You get grade C");
            else if (total_score >= 50)
                System.out.println("You get grade D");
            else
                System.out.println("You get grade F");
        }
    }
}
