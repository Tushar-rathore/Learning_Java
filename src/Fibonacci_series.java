import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0, b=1,c,i,input;
        System.out.print("enter your number to print fibonacci till that:");
        Scanner Input = new Scanner(System.in);
        input = Input.nextInt();
        for (i=1;i<=input;i++){
            System.out.println(a+ "\t"); //0 1
            c = a+b;
            a = b;
            b = c;

        }
    }
}
