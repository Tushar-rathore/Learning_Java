class phone{
    public void off(){
        System.out.println("Hello there Your Phone is Turning Off......");
    }
    public void on(){
        System.out.println("Hello there Your Phone is Turning ON......");
    }
}
class smartphone extends phone{
    public void smartphoneoff(){
        System.out.println("Hello there Your Smartphone is Turning OFF......");
    }
    @Override
    public void on() {
        System.out.println("Hello there Your Smartphone is Turning ON...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
    phone usingphone = new smartphone(); // this is Dynamic Method Dispatch in which parent class phone reference is usingphone
        // can be equal to subclass smartphone's object
//        smartphone hjg = new phone();  not allowed
        usingphone.off();
        usingphone.on(); // it will print smartphone on because its takinng reference of parent class but is equal to childs class object
//        usingphone.smartphoneoff(); not allowed


    }
}
