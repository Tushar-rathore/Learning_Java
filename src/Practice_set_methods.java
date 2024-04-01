import java.util.Scanner;

public class Practice_set_methods {

/*        problem 1 method
    static void multiply(int n) {
        for (int i = 1; i<=10; i++) {
            System.out.println(n*i); }
    }*/

  /*  Problem 2 pattern
    static void pattern(int n){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

  /* Problem 3
   static int sum_of_N_num(int a){
        if (a == 1){
            return 1;
        }

        return  a + sum_of_N_num(a-1);
    }
*/
/*   Problem 4
  public static void pattern2(int n){
      for (int i = 0; i<=n; i++){
          for (int j = n; j>i-1; --j){  // one extra is printing
              System.out.print("*");
          }
          System.out.println(" ");
      }
  }*/

 /*   problem 5
static int fib(int n) {
         if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}*/

/*        Problem 6
    static int sumofn(int ...arr){
        int result = 0;
        for (int a:arr ) {
            result += a;
        }
        return result;
    }*/

 /*   problem 7
    static int printing(int a){
        printing(a-0);
        if (a<0){
            System.out.println("try again");
        }
       return a;
    }*/
/*     problem 8
    pattern using recursion
 static void patternusingrecursion(int n){
     if (n > 0) {
         patternusingrecursion(n - 1);
         for (int i = 0; i < n; i++) {
             System.out.print("*");
         }
         System.out.println();
     }
 }
 */

/*    Problem 9
static float conversion(float N){
    // function to convert Celsius
    // scale to Fahrenheit scale
    {
        return ((N * 9.0f / 5.0f) + 32.0f);
    }
}*/
//    problem 10
static int sum_of_N_num(int a){
    int sum = 0;

    for (int i = 0; i<= a; i++ ){
        sum += i;

    }
    return sum;
}

    public static void main(String[] args) {
       /*   problem 1
        System.out.print("enter your number to print its Table:");
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        multiply(n);
*/

     /*   Problem 2
pattern(5);*/

     /*   Problem 3
        System.out.print("enter so it will print sum of your first n numbers: \t");
        Scanner Input = new Scanner(System.in);
        int a = Input.nextInt();
        int b = sum_of_N_num(a);
        System.out.println(b);*/

      /*  Problem 4
        pattern2(3);*/

/*
     problem 5
        int result = fib(3);
        System.out.println(result);

*/

 /*   Problem 6
        System.out.print("enter so it will print sum of your n numbers: "+sumofn(10, 60,20));
*/

 /*       problem 7
        System.out.println(printing(4));*/

        /* problem 8
        patternusingrecursion(4);*/

        /* problem 9
System.out.println(conversion(0));
        */

//        problem 10
//        System.out.println(sum_of_N_num(10));

        System.out.println(  sum_of_N_num(10));
    }
}



