/*
import java.util.Scanner;

import static java.lang.Math.*;

// problem 1
class cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();
        return radius;
    }

//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

    public int getHeight() {
        Scanner input = new Scanner(System.in);
         height = input.nextInt();
        return height;
    }

//    public void setHeight(int heightinput) {
//        this.height = heightinput;
//    }

    public double surfaceArea(){
        return 2* PI* radius * radius + 2* PI*radius*height;
    }
    public double volume(){
        return  PI* radius * radius * height;
    }

}
public class Practising_access_modifiers_and_Constructor {
    public static void main(String[] args) {
    cylinder mycylinder = new cylinder();
        System.out.println("enter height");
        System.out.println(mycylinder.getHeight());
        System.out.println("enter radius");
        System.out.println(mycylinder.getRadius());
        //problem 2
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}
*/
/*import java.util.Scanner;

import static java.lang.Math.*;

// problem 1
class cylinder{
    private int radius;
    private int height;

 public int getRadius() {
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();
        return radius;
    }
    public int getHeight() {
        Scanner input = new Scanner(System.in);
        height = input.nextInt();
        return height;
    }

    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public double surfaceArea(){
        return 2* PI* radius * radius + 2* PI*radius*height;
    }
    public double volume(){
        return  PI* radius * radius * height;
    }

}
public class Practising_access_modifiers_and_Constructor {
    public static void main(String[] args) {
        cylinder mycylinder = new cylinder(9 , 12); // problem 3
        System.out.println("enter height");
        System.out.println("enter radius");

        //problem 2
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}

*/
/*

// problem 4
class rectangle{
    private int length;
    private int bredth;
    public rectangle(){
        this.length = 22;
        this.bredth = 10;
    }

    public int getLength() {
        return length;
    }

    public int getBredth() {
        return bredth;
    }

    public rectangle(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }
}
public class Practising_access_modifiers_and_Constructor {
    public static void main(String[] args) {
        rectangle r = new rectangle(9 , 12);
        System.out.println(r.getBredth());
        System.out.println(r.getLength());
        System.out.println("enter height");
        System.out.println("enter radius");

    }
}
*/
//problem 5

import java.util.Scanner;
import static java.lang.Math.*;

class sphere{
    private int radius;

    public int getRadius() {
        Scanner input = new Scanner(System.in);
        radius = input.nextInt();
        return radius;
    }

public double volume(){
        return  (double) (radius * radius * radius * 22) /7*4/3;
}

}
public class Practising_access_modifiers_and_Constructor {
    public static void main(String[] args) {
        sphere mysphere = new sphere();
        System.out.println("enter radius");
        System.out.println(mysphere.getRadius());
        System.out.println("your given sphere volume is :  " + mysphere.volume());
    }
}



