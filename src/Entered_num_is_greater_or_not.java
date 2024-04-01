import java.util.Scanner;

public class Entered_num_is_greater_or_not {
    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner UserNumber = new Scanner(System.in);
        int b = UserNumber.nextInt();
        System.out.println(b<100);



    }
}

