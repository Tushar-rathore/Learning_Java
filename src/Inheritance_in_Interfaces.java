interface MySampleInterface{ // interfaces can extend another interfaces that is inheritance in this
     void meth1();
     void meth2();
}
interface MyChildSampleInterface extends MySampleInterface{
    void meth3();
    void meth4();
}

class UserOfSampleInterfaces implements MyChildSampleInterface{
//note - you cant extend the interface in Interface you can only implements it in the clas

    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
    UserOfSampleInterfaces using = new UserOfSampleInterfaces();
    using.meth1();
    using.meth2();
    using.meth3();
    using.meth4();
    }
}
