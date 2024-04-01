public class Practice_set_oops1 {
    /*  Problem 1
    static class employee{
         int salary;
         String name;
         public int getsalary(){
             return salary;
         }
         public String getname(){
             return name;
         }
         public void  setname(String n){
              name = n;
         }
     }

     public static void main(String[] args) {
 employee tushar = new employee();
 tushar.setname("Rathore");
 tushar.salary = 100;
         System.out.println(tushar.salary);
         System.out.println(tushar.getname());


     }*/
  /* problem 2
  static class cellphone{
public void ring(){
    System.out.println("Ringing");
}
       public void vibrate(){
           System.out.println("vibrating");
       }

   }
   public static void main(String[] args) {
cellphone oppo = new cellphone();
oppo.vibrate();
oppo.ring();
   }*/
 /* problem 3
   static class rectangle{
       int side;
        public int area(){

           return side*side;
        }
        public int perimeter(){

            int a;
            return  4*side;
        }
   }
   public static void main(String[] args) {
rectangle test= new rectangle();
test.side = 3;
test.area();
test.perimeter();
       System.out.println(test.area());
       System.out.println(test.perimeter());*/
    /*  problem 4
    static class rectangle {

        int length;
        int width;

        public int area() {
            return width * length;
        }

        public int perimeter() {
            return length + width * 2;
        }
    }

    public static void main(String[] args) {
        rectangle test = new rectangle();
        test.length = 3;
        test.width = 4;
        test.area();
        test.perimeter();
        System.out.println(test.area());
        System.out.println(test.perimeter());

    }*/
  /* problem 5
    static class Game{
        public void hit(){
            System.out.println("Hitting Hard");
        }
        public void run(){
            System.out.println("Run Dude otherwise you're Deadmeat");
        }
        public void fire(){
            System.out.println("Fire Fire Fire just beat the ............");
        }
    }

    public static void main(String[] args) {
            Game gaming = new Game();
        System.out.println("Welcome To the Game of Life");
            gaming.fire();
            gaming.run();
            gaming.hit();

    }*/
/* problem 6
 static class circle {

        int radius;

        public int area() {
            return 22/7 *(radius*2);
        }

        public int perimeter() {
            return (22/7*2)*radius;
        }
    }

    public static void main(String[] args) {
        circle test = new circle();
        test.radius = 3;
        test.area();
        test.perimeter();
        System.out.println(test.area());
        System.out.println(test.perimeter());

    }*/

}

