import java.util.Scanner;

class testingg{
    int a = 10;
    protected int b = 20;
}

class childOFtesting extends testingg{
   childOFtesting(){
       System.out.println(a);
       System.out.println(b);
   }
}

public class Practice_Set_on_Java_Package_Access_Modifiers {
    public static void main(String[] args) {
      // first question is about packages so i have understand the concept but not written it here since its in vs code
      //question 2
//        System.out.print("Enter Your Number: ");
//        Scanner takinginput = new Scanner(System.in);
//      String input = takinginput.next();
//        System.out.println("your number is :"+input);

//        question 3
        childOFtesting t = new childOFtesting();

    }

}
