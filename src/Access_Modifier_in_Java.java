import javax.swing.*;
/* private keyword
class  Employee {

    private int id = 4;
    private  String name;

}*/
/*accessing private keyword with methods*/
class marks{
    private int id;
    private String studentname;
    public void settingID(int i){
        id = i;
    }
    public int gettingID(){
        return id;
    }
    public void settingName(String n){
        studentname = n;
    }
    public String gettingName(){
        return studentname;
    }
}
public class Access_Modifier_in_Java {
/*
    public static void main(String[] args) {
         Employee emp1 = new Employee();
                emp1.id = 3;
                emp1.name = "tushar";
        System.out.println(emp1.id);
        System.out.println(emp1.name);

            }*/
public static void main(String[] args) {
    marks usingmarks = new marks();
    usingmarks.settingID(100);
    System.out.println(usingmarks.gettingID());
    usingmarks.settingName("Tushar");
    System.out.println(usingmarks.gettingName());
}
}

