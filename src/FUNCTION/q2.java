package FUNCTION;

public class q2 {
    public static int compare(int[] arry) {
        int smallest = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < smallest) {
                smallest = arry[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 3, 5};
        int smallest = compare(numbers);
        System.out.println("The smallest number is: " + smallest);

    }
}