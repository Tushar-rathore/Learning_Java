import java.util.Scanner;

public class Num_entered_by_user_is_intOrNot {
    public static void main(String[] args) {
        System.out.println("Enter Your number ");
        Scanner test = new Scanner(System.in);
        boolean testing = test.hasNextInt();
        System.out.println(testing);
        if (testing == true)
            System.out.println("your no is integer");
        else
                System.out.println("Your no is not an integer");

    }
}
