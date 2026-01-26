import java.util.Scanner;

public class Lab602 {
    static int find_rank(double score,double[] rate_score){
        int rank = 1;
        for (double s : rate_score) {
            if (s > score) {
                rank++;
            }
        }
        return rank;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] movies = {"Me Before You", "Titanic", "Before Sunrise", "The Holiday", "A Walk to Remember"};
        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};
        System.out.print("Enter a movie title: ");
        String movie_title = sc.nextLine();
        int index = 0;
        boolean found = false;
        for (String movie : movies){
            if (movie_title.equalsIgnoreCase(movie)){
                System.out.println("\nThe rating score of \"" + movie + "\"" + " is " + rate_scores[index]);
                int rank = find_rank(rate_scores[index], rate_scores);
                System.out.println("This movie is ranked number " + rank);
                found = true;
            }
            index++;
        }
        if (!found)
            System.out.println("\nCannot found this movie title...");

    }
}
