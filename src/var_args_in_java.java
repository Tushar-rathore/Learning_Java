import java.util.Scanner;

public class var_args_in_java {
    static int sum(int ...arr){
//        static int sum(int x, int ...arr){    // you can write in this format also but one argument have to be given for output as x will be compulsory parameter
        int result = 0;
        for (int a:arr ) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("your answer:\t"+ sum(2,2,2,2,2,2,2,2,2, 11, 1234));

    }
}
