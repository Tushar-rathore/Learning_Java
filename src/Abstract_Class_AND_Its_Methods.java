class learning {
public void simplemethod(){
    System.out.println("hello i am a simple method");}
        }
abstract class learningabstract{ // abstract class (if any abstract method is present in class then it is abstract class)
    abstract public void  abstractmethod(); // abstract method
}
class learning2 extends learningabstract{
    @Override
    public void abstractmethod() {
        System.out.println("welcome i am a abstract method");

    }
}
public class Abstract_Class_AND_Its_Methods {
    public static void main(String[] args) {
    learning l = new learning();
    learning2 ll = new learning2();
    String a = "hello";
       System.out.println();
    }
}
