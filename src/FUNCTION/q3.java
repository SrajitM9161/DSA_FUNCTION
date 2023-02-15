package FUNCTION;

public class q3 {
public static int avg (int [] arry){
    int average =0;
    for (int i=0 ; i< arry.length; i++){
    average += arry[i];
    }
    int ans= average/ arry.length;
    return ans;
}
    public static void main(String[] args) {
        int[] numbers = {7, 3, 5};
        int smallest = avg(numbers);
        System.out.println("The smallest number is: " + smallest);
    }
}
