/* problem 1 and 2
abstract class pen{
   abstract void write();
   abstract void refill();
}
class usingpen extends pen{

    void write() { System.out.println("writing start"); }
    void refill() { System.out.println("refilling start"); }

    public void changenib(){
        System.out.println("Changing Nib");
    }

}

public class Practice_Set_Interfaces_and_Abstract_Classes {
    public static void main(String[] args) {
    usingpen p = new usingpen();
    p.refill();
    p.write();
    p.changenib();
    }
}
*/
/* problem 3
class  Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void Bite(){
        System.out.println("Biting");
    }
}
 interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override public void eat(){
        System.out.println("Eating");
    }
   @Override public void sleep(){
        System.out.println("Sleeping");
    }

}
public class Practice_Set_Interfaces_and_Abstract_Classes {
    public static void main(String[] args) {
    Human AmitabhBacchan = new Human();
    AmitabhBacchan.Bite();
    AmitabhBacchan.jump();
    AmitabhBacchan.eat();
    AmitabhBacchan.sleep();

    Monkey poly = new Human(); // polymorphism problem 5
    poly.jump();
    poly.bite();
    }
}
*/
/* problem 4
abstract class Telephone{
    abstract  void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{

        @Override void ring() {  System.out.println("ring"); }
        @Override  void lift() { System.out.println("lift"); }
        @Override void disconnect() {  System.out.println("disconnect"); }

    void Openapp(){
        System.out.println("Opening App");
    }
}
public class Practice_Set_Interfaces_and_Abstract_Classes {
    public static void main(String[] args) {
        Telephone nokia = new SmartTelephone();
        nokia.disconnect();
        nokia.lift();
        nokia.disconnect();
       //  nokia.Openapp(); // polymorphism will give error

    }
}
*/

// problem 6
interface SmartTvRemote{
     void Touch();
}
interface TVremote extends SmartTvRemote{
    void button();
}

class usingTV implements SmartTvRemote{ // inheritance

    public void button() {
        System.out.println("button control");
    }
    public void Touch() {
        System.out.println("touch control");
    }
}

public class Practice_Set_Interfaces_and_Abstract_Classes {
    public static void main(String[] args) {
        usingTV tv = new usingTV();
        tv.button();
        tv.Touch();

    }
    }
