class test{
    int a = 5;

    public int getting(){
        this.a = 9;

        return a;
    }
    public test(int b){
        this.a = b;
        System.out.println("I am the constructor" + b);

    }


}
 class testt extends test{
    public testt(int c) {
         super(c); // using super keyword to take reference and use the above constructor of parent class in derived class
     }
 }
public class This_And_Super_Keyword {
    public static void main(String[] args) {
    test testing = new test(5);
    testt testing2 = new testt(3);
        System.out.println(testing.getting());

    }
}
