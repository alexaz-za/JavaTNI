public class Ex602 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        int[] prices = {30, 10, 50, 25, 40};
        int index = 0;
        for (String fruit : fruits){
            System.out.println(fruit + " = " + prices[index] + " baht");
            index++;
        }
    }
}
