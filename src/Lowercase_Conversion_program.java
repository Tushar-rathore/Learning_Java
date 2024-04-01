import java.util.Scanner;
public class Lowercase_Conversion_program {
    public static void main (String[] args){

        System.out.println("Enter Your Characters For converting it into lowercase");
        Scanner Userinput = new Scanner(System.in);
        String use = Userinput.next();
        String usinglowercase = use.toLowerCase();
        System.out.println("your input in lowercase : " + usinglowercase);

    }
}
