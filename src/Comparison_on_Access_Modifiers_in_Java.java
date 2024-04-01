class testing{
    public  int a = 10;
    private int b = 20;
    int c = 30;
    protected int d = 40;

    public void meth1(){ // i can use all access modifiers in the same class
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class test2 extends testing{
    int zz = 100;
}

public class Comparison_on_Access_Modifiers_in_Java {
    public static void main(String[] args) {
testing test = new testing();
        System.out.println(test.a);
//        System.out.println(test.b); its private so i cant use it in same package and subclass
        System.out.println(test.c);
        System.out.println(test.d);

        test2 t = new test2();
        System.out.println(t.a);
        System.out.println(t.c);
        System.out.println(t.d);
//        System.out.println(t.b);   it will throw error because private is not accessible in subclass

    }
}
