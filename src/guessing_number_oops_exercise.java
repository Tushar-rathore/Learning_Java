import java.util.Random;
import java.util.Scanner;

class Game{  // allows user to guess the number

/*//    public int GuessingNumberGame(){ // overall function for easy use all are under this function acting like container*/
    int ComputersInput; int userinput; // defining global variables
    public int TakeUserInput(){ // taking user input function
        Scanner input = new Scanner(System.in);
        return userinput = input.nextInt();
    }
       public int Game(){ // Constructor to generate the Random Number
        Random Randomnumber = new Random();
       return   ComputersInput = Randomnumber.nextInt(100);
    }
    public int IsCorrectNumber(){
         for (int i = 1; i<=5; i++){ // using for loop to let user guess the number 5 times
            TakeUserInput(); // taking input function
        if (userinput == ComputersInput){
            System.out.println("congratulations 😎🎉🎊,You guessed the Number " );
            break;
        } else if (userinput < ComputersInput) {
            System.out.println("your number is smaller than the computer so try again and you are on your "+ i + " option " );
        }else if (userinput > ComputersInput) {
            System.out.println("your number is Greater than the computer so try again and you are on your"+  i + " option ");
        }else TakeUserInput();

    }
        return tryagain();
    }
    public int tryagain(){ // just for now
       return 0;
    }
}
public class guessing_number_oops_exercise {
    public static void main(String[] args) {
        System.out.print("Enter Your Number Between 100 to Start the Game : ");
        Game usingGame = new Game();
        System.out.println(usingGame.IsCorrectNumber());
        System.out.println("computers number is: "+ usingGame.ComputersInput);
    }
}