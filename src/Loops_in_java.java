import java.util.Scanner;

public class Loops_in_java {
    public static void main(String[] args) {

//       while loop
//        int i = 100;
//while (i<=200){
//    System.out.println("value is:\t"+i);
//    i++;
//}

//        Do while loop
//        System.out.println("Enter your number under 500");
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        do {
//            System.out.println("value is:\t"+N);
//            N++;
//        } while (N<=500);{
//
//
//        }
//            For loop

        System.out.print("Enter your number to find it in reverse order");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i=N;i!=0;i--){
            System.out.println(i);
        }


//        program to find the first odd numbers
//        System.out.print("Enter your number to find first odd number of it :");
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        for (int i=0;i<N;i++){
//            System.out.println(2*i+1);
//        }

    }
}
