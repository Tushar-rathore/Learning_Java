import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner NUM =  new Scanner(System.in);
        System.out.println("enter your 1st number");
        int a = NUM.nextInt();

        System.out.println("enter your 2nd number");
        int b = NUM.nextInt();

        System.out.println("enter your 3rd number");
        int c = NUM.nextInt();

        int sum = a + b + c;
        System.out.println("value of the sum is: " + sum );
//        System.out.println("your percentage is " + sum*3/100);
    }
}