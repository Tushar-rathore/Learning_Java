public class Constructors_In_Inheritance {
        static class  animal{
        public animal(){
            System.out.println("i am a Constructor of the base class");     }
            public animal(int a){ // this is an overloaded constructor
        System.out.println("i am an overloaded Constructor of the base class: " + a);     }
        }

        static class Dog extends animal {
            public Dog(){
                System.out.println("i am the constructor of the derived class");
            }
            public Dog(int a, int b){ // this is an overloaded constructor of the derived class
                super(a);   // using the super keyword we are accessing the overloaded constructor
                System.out.println("i am an overloaded Constructor of the derived class: " + a + b);     }
        }
        static class puppy extends Dog{
            public puppy(){
                System.out.println("i am a child of constructor from derived class");     }
            public puppy(int a, int b, int c){ // this is an overloaded constructor of the child of the derived class
                super(a,b);   // using the super keyword we are accessing the overloaded constructor
                System.out.println("i am child of overloaded constructor from derived class: " + a + b + c);     }
        }


            public static void  main(String[] args) {
//                animal ani = new animal(10);
//                Dog usingdog = new Dog(10,20);
                puppy usingpuppy = new puppy(10,20,30);




    }
}
