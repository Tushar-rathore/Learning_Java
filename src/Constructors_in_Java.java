public  class Constructors_in_Java {
    static class marks{
        private int id;
        private String studentname;
        public void settingID(int i){this.id = i;}
        public int gettingID(){return id;}
        public void settingName(String n){this.studentname = n;}
        public String gettingName(){return studentname;}
//        public marks(String TryingdataoOfConstructor, int DataOfConstructor){ // this is the constructor the same name as the class
//            studentname = TryingdataoOfConstructor;
//            id = DataOfConstructor;
//        }
        public marks(int salary){ // Constructor overloading
           id = salary;
        }
    }
    public static void main(String[] args) {
//marks usingmarks = new marks("itistheconstructor", 12); // intialising the data on constructor
        marks usingmarks = new marks(567); // intialising the data on constructor

        System.out.println(usingmarks.gettingID());
        System.out.println(usingmarks.gettingName());

    }
}
