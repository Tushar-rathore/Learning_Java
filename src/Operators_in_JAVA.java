import java.util.Scanner;

public class Operators_in_JAVA {
    public static void main(String[] args) {

//       Arithmetic Operators
        int a = 10;
        int b = 20;
        int c = a++;
        int d = b++;
        int e = a+b;
        int f = a-b;
        int g = a*b;
        int h = b/a;


        System.out.println("Arithmetic Operators");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

// Assignment Operators
        System.out.println("Assignment Operators");
        System.out.println(a+b);
        int z = 2;
        z += 4; /* in this we are assigning + 4 in z so the value will be 4+2 = 6*/
        System.out.println(z);

//        Comarison Operators

        System.out.println("Comarison Operators ");
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(a>=b);

//        Logical operator
        System.out.println("Logical operator");
        System.out.println(b>a && b<a);
        System.out.println(b>a || b<a);
//        Bitwise operators are also there but we will not go in-depth in it for now
    }

}
