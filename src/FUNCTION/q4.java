package FUNCTION;

import java.util.Scanner;

public class q4 {
public static int vowel(String word){
    int count=0;
    for (int i=0;i<word.length();i++ ){
       if (word.charAt(i)=='a' || word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
           count++;

       }
    }

return count;
}
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String word= sc.nextLine();
        System.out.print(vowel(word));
    }
}
