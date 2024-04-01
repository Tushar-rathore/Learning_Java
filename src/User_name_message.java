import java.util.Scanner;

public class User_name_message {
    public static void main(String[] args) {
        System.out.print("What is your Name: ");
        Scanner Name = new Scanner(System.in);
        String nname = Name.nextLine();
        System.out.println("<"+nname+">"+ " Have a Good Day");
    }
}
