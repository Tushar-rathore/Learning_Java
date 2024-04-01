
public class Methods_in_java {
    static int logic(int x, int y){
            int z;
            if(x>y){
                z = x+y;
            }
            else {
                z = (x +y) * 5;
            }
            x = 566;
            return z;
        }
//            method overloading function
   /* static void printing(){
//            method overloading
        System.out.println("testing method overloading");
    }*/
    static void printing(int a){
        System.out.println("hello there mr"+ a);
    }


        public static void main(String[] args) {
            int a = 5;
            int b = 7;
            int c;
            // Method invocation using Object creation
            //cwh_31_methods obj = new cwh_31_methods();
            //c = obj.logic(a, b);
            c = logic(a, b);
            System.out.println(a + " "+ b);
            int a1 = 2;
            int b1 = 1;
            int c1;
            c1 = logic(a1, b1);
            System.out.println(c);
            System.out.println(c1);


//            method overloading
           // printing(); this is for the other printing function which doesnt contain intezer
    printing(1);

        }
    }

