import java.util.Scanner;

public class percentage_finder {

    public static void main(String[] args) {
        System.out.println("Calculate your percentage here");
        Scanner CBSEMARKS = new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
        float a = CBSEMARKS.nextFloat();
        System.out.println("Enter 2nd subject marks");
        float b = CBSEMARKS.nextFloat();
        System.out.println("Enter 3rd subject marks");
        float c = CBSEMARKS.nextFloat();
        System.out.println("Enter 4th subject marks");
        float d = CBSEMARKS.nextFloat();
        System.out.println("Enter 5th subject marks");
        float e = CBSEMARKS.nextFloat();
        float sum = a+b+c+d+e;

        float percentage = (sum)/400*100;
        System.out.println("Your percentage is:" + percentage);

    }
}
