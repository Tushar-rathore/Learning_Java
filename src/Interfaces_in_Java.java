/*
interface trying{ // interface
    void tryingfunction1();
}
//    abstract class tryingabstractclass{
//    abstract public void tryingabstractfunction1();
//}
class using implements trying{
   public void tryingfunction1(){
        System.out.println("interface function");
    }
}



public class Interfaces_in_Java {
    public static void main(String[] args) {

/* Abstract class  	Interface
        1. It can contain abstract and non-abstract method	--------------------------It can only contain abstract methods. We do not need to use the "abstract" keyword in interface methods because the interface is implicitly abstract.
        2. abstract keyword is used to declare an abstract class.	----------------------interface keyword is used to declare an interface.
        3.  A sub-class extends the abstract class by using the "extends" keyword.	----------------------The "implements" keyword is used to implement an interface.
        4. A abstract class in Java can have class members like private, protected, etc. 	---------------------Members of a Java interface are public by default.
        5. Abstract class doesn't support multiple inheritance.	-------------------Multiple inheritance is achieved in Java by using the interface.
   */
/*
 // abstract vs interfaces
//        trying t = new using();
//        using u = new using();
        using u = new using();
        System.out.println();
//        t.tryingfunction1();
        u.tryingfunction1();
    }
}
*/
/*  //java interfaces example and default method
interface camera {
    void takesnap();

    void recordvideo();

    default void record4KVideo() {
        System.out.println("Recording in 4k..."); // default method
    }
}

    interface wifi {
        String[] getnetwork();

        void connettonetwork(String network);
    }

    class Mycellphone {
        void callnumber(int phonenumber) {
            System.out.println("calling" + phonenumber);
        }

        void PickCall() {
            System.out.println("connecting..........");
        }
    }

    class MySmartPhone extends Mycellphone implements camera, wifi {
        public void takesnap() {
            System.out.println("Taking snap");
        }

        public void recordvideo() {
            System.out.println("taking video");
        }

        public String[] getnetwork() {
            System.out.println("Getting List of Networks");
            String[] networkList = {"tushar", "rahul", "harsh"};
            return networkList;
        }

        public void connettonetwork(String network) {
            System.out.println("Connecting to " + network);
        }
    }

    public class Interfaces_in_Java {
        public static void main(String[] args) {
            MySmartPhone realme = new MySmartPhone();
            String[] ar = realme.getnetwork();
            for (String list : ar) {
                System.out.println(list);
            }
            realme.connettonetwork("Tushar");
            realme.callnumber(1234567891);
            realme.PickCall();
            realme.takesnap();
            realme.recordvideo();
            realme.record4KVideo();
            System.out.println("ok shutting down now ");
        }
    }*/




