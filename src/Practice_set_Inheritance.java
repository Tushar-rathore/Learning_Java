class circle{
//    problem 1 and 3
    int radius = 0;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    public circle(){
        System.out.println("Hello there i am a circle");
    }
}
class cylinder extends circle{
    private int height;

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    public cylinder(){
        System.out.println("Hello there i am a cylinder");
    }
}

public class Practice_set_Inheritance {
    public static void main(String[] args) {
//         Problem 1
          cylinder cy = new cylinder();
// create getters and setters with method of rectangle nad its child cuboid

    }
}

