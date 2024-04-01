import java.util.Scanner;

public class Loops_Practice {
    public static void main(String[] args) {

        //solution to print * pattern
//        int a = 5;
//        for (int i=a;i>0;i--){
//            for (int j=0; j<=i;j++){
//                System.out.print("*");
//
//            }
//            System.out.print("\n");
//        }

//        Question 2
//        System.out.print("enter number to print first even numbers under 500:");
//        Scanner Userinput = new Scanner(System.in);
//        int number = Userinput.nextInt();
//        int sum = 0;
//        for (int i=0; i<number; i++){
//          sum = sum + 2*i;
//        }
//        System.out.print("sum of the first even numbers you have mentioned is :"+sum);

//        Question 3

//        System.out.print("enter number to print its multiplication table:");
//        Scanner Userinput = new Scanner(System.in);
//         int n = Userinput.nextInt();
//         for (int i=1; i<=10;i++){
//             int table = n*i; main logic for table printing
//             int table = n*i;
//             System.out.printf("%d * %d = %d\n",n,i,table);
//         }

//question 4

//        System.out.print("enter number to print its multiplication table in reverse order:");
//        Scanner Userinput = new Scanner(System.in);
//         int n = Userinput.nextInt();
//         for (int i=10; i>=1;i--){
//             int table = n*i; main logic for table printing
//             int table = n*i;
//             System.out.printf("%d * %d = %d\n",n,i,table);
//         }

//         question 5
//        System.out.print("enter number to its factorial:");
//        Scanner Userinput = new Scanner(System.in);
//        int n = Userinput.nextInt();
//        int i,fact=1;
//
//        for(i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);

//question 6
//        int i =1;
//        while (i<=10){
//            System.out.println("5");
//            i++;
//       }

//        question 7
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d -> 1\n",i);
//
//        }

//        question 8
        System.out.print("enter number to print its multiplication table to get sum of the occurring numbers:");
        Scanner Userinput = new Scanner(System.in);
         int n = Userinput.nextInt();
         int sum = 0;
         for (int i=1; i<=10;i++){
             int table = n*i;

             System.out.printf("%d * %d = %d\n",n,i,table);
                sum += n * i;
         }
        System.out.println("sum of the number occurring in this are"+sum);


    }
}





