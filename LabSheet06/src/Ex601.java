public class Ex601 {
    public static void main(String[] args) {
        int[] numbers = {38, 7, 91, 54, 12, 83, 26};

        System.out.println("Length of numbers: " + numbers.length);
        System.out.println("The first element: " + numbers[0]);
        System.out.println("The last  element: " + numbers[numbers.length-1]);
        System.out.print("List of numbers in array: ");
        for(int num : numbers)
            System.out.print(num + " ");
    }
}
