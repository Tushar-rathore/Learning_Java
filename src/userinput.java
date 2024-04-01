import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        System.out.println("give your number here");
        Scanner marks = new Scanner(System.in);
        int a = marks.nextInt();
        int b = marks.nextInt();
        int c = a+b;
        System.out.println("Your sum of number is: " + c );

    }
}
//
//import java.util.Scanner;
//        public class userinput {
//    public static void main(String[] tryy){
//    System.out.println("enter your numbers");
//            Scanner Mark = new Scanner(System.in);
//            int a = Mark.nextInt();
//            int b = Mark.nextInt();
//        System.out.println("your first number is "+ a);
//        System.out.println("your second number is "+ b);
//        }}