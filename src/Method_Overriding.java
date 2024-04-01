class A{
    public void test(){
        System.out.println("i am function of class A");
    }
}
class B extends A{
    @Override
//    @Override annotation it doesn't affect the code it just helps you in remembering that you are doing function overriding and it will give error when there will be no function overriding and you used this

    public void test(){ // function name is same but value is different is called method overriding

        System.out.println("I am function of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
    A a = new A();
        a.test();
    B b = new B();
       b.test();
    }
}
