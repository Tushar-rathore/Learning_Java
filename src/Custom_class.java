
class employee{ //  defining our class
    String name = "bhupendra jogi";
        int salary = 56;

    public void test(){ // defining method or function whatever you call it in this clas
        System.out.println("my name is - " +name);
        System.out.println("my salary is "+salary);

    }
    public int getsalary(){
        System.out.println(salary);
                return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("Accessing our custom class");
        employee max = new employee();
/*        max.salary = 10;
        max.name = "max";
        System.out.println(max.name);
        System.out.println(max.salary);*/
        max.test();  // calling the method

        max.getsalary();
    }
}


