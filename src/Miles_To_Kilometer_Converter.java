import java.util.Scanner;

public class Miles_To_Kilometer_Converter {
    public static void main(String[] args) {
        System.out.println("To Get Miles");
        System.out.println("Enter your Kilometers here");
        Scanner Travel = new Scanner(System.in);
        Double t1 = Travel.nextDouble();
        Double KM = 0.621371;
        Double Miles = t1*KM;
        System.out.println("Miles:" + Miles);
    }
}
