import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissors_game {
    public static void main(String[] args){
        System.out.println("this is rock paper scissor game between you and system");
        System.out.print("Enter your choice 0 for Rock, 1 for Paper, 2 for Scissor:");
        Scanner input = new Scanner(System.in);
        String userinput = input.next();
        switch (userinput){
            case ("0")-> System.out.println("you choice is Rock");
            case ("1")-> System.out.println("you choice is Paper");
            case ("2")-> System.out.println("you choice is Scissor");
        }
        Random random = new Random();
        int computerinput = random.nextInt(2); //generating random number between 0 and 2
        if (computerinput == Integer.parseInt(userinput)) {
            System.out.println("it's a draw");
        } else if (computerinput==0 && Integer.parseInt(userinput)==1) {
            System.out.println("you win paper catches the rock");
        }else if (computerinput==0 && Integer.parseInt(userinput)==0) {
            System.out.println("its a draw");
        }else if (computerinput==0 && Integer.parseInt(userinput)==2) {
            System.out.println("you lose rock smashes the scissor");
        }else if (computerinput==1 && Integer.parseInt(userinput)==0) {
            System.out.println("you win paper catches the rock");
        }else if (computerinput==1 && Integer.parseInt(userinput)==2) {
            System.out.println("you win scissor cuts the paper");
        }else if (computerinput==2 && Integer.parseInt(userinput)==0) {
            System.out.println("you win rock smashes the scissor");
        }else if (computerinput==2 && Integer.parseInt(userinput)==1) {
            System.out.println("you lose scissor cuts the paper");
        }else {
            System.out.println("enter only between 1 to 2");
        }
        System.out.println("computerinput is : " +computerinput);

//    while (computerinput == Integer.parseInt(userinput)){
//
//    }
    }
}
