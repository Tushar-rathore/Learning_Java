import java.util.Scanner;

public class Practice_questions_conditionals {
    public static void main(String[] args) {

//        Question 1
//        int a = 10;
//        if (a==11){
//            System.out.println("i am 11");
//            }else {
//            System.out.println("i am not 11");
//                    }

//        Question 2
//        System.out.println("Enter Your Marks Here to Know That You are Fail or Not");
//        System.out.println("Enter 1st Subject Marks");
//        Scanner inputofuser = new Scanner(System.in);
//        int subject1 = inputofuser.nextInt();
//        System.out.println("Enter 2nd Subject Marks");
//        int subject2 = inputofuser.nextInt();
//        System.out.println("Enter 3rd Subject Marks");
//        int subject3 = inputofuser.nextInt();
//        int total = subject1+subject2+subject3;
//        float result = total/3;
//        System.out.println(result+"%");
//        if (result>=33.0 && subject1>=33 && subject2>=33 && subject3>=33){
//            System.out.println(" Congratulations You are Pass");
//        }else {
//            System.out.println("you are fail but best of luck and try harder this time");
//        }

//        Question 3
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = inputofuser.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);

//        question 4
//        System.out.println("Enter number beetween 1 to 7 ");
//        Scanner inputofuser = new Scanner(System.in);
//        String input = inputofuser.next();
//        switch (input){
//            case "1" -> System.out.println("today is monday");
//            case "2" -> System.out.println("today is tuesday");
//            case "3" -> System.out.println("today is wednesday");
//            case "4" -> System.out.println("today is thursday");
//            case "5" -> System.out.println("today is friday");
//            case "6" -> System.out.println("today is saturday");
//            case "7" -> System.out.println("today is sunday");
//            default -> System.out.println("enter number between 1 to 7 only");}

//        question 5
//        System.out.println("Enter your year to check year is leap or not");
        Scanner inputofuser = new Scanner(System.in);
//        int year = inputofuser.nextInt();
//        if (year % 4  == 0 && year % 100!= 0 || year%400 == 0) {
//            System.out.println("yes it is leap year");
//        } else {
//            System.out.println("not a leap year");
//        }
//        question 6
        System.out.println("enter your website full domain");
        String website = inputofuser.next();
        if (website.endsWith(".com")){
            System.out.println("this is an Commercial website");

        } else if (website.endsWith(".org")){
            System.out.println("this is an organizational website");

        } else if (website.endsWith(".in")){
            System.out.println("this is an Indian website"); }
        else {
            System.out.println("give valid domain name");
        }

        }
    }

