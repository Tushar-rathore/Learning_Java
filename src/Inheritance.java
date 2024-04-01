class animal{
    public void live(){
        System.out.println("Just Live Free my nature-mates");
    }
    public void love(){
        System.out.println("Just some Love for Animals");
    }
}
class Dog extends animal{
    public void type(){
        System.out.println("one of the types are Bull-Dog");
    }
}
public class Inheritance {
    public static void main(String[] args) {
    Dog usingdog = new Dog();
    usingdog.type();
    usingdog.live(); // these are all superclass or base or parent class (animal) methods
    usingdog.love(); // which are inherited to subclass or derived or child class (dog)
    }
}
