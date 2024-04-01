import java.util.Scanner;
public class Java_Conditionals_If_else_and_switch_case {
    public static void  main(String[] args){
        System.out.println("Enter Your Age for Checking that you are eligible for driving licence or not");
        Scanner Userinput = new Scanner(System.in);
       int  a = Userinput.nextInt();
       if (a>=18){
           System.out.println("You are eligible");
       }else {
           System.out.println("you are not eligible kiddo just wait some more years");
       }
//       Switch case example

       String varr = "life";
switch ("life"){
           case "life" -> System.out.println("Code and Code");
}




    }
}
