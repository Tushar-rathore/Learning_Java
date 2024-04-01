public class Arrays_in_Java {
    public static void main(String[] args) {
//        Declaration and memory allocation
            int [] students = new int[5] ;
//            Initialization
            students [0]= 20;
            students [1]= 10;
            students [2]= 2110;
            students [3]= 210;
            students [4]= 120;


        System.out.println("specific display of array variable: "+students[4]);
        // another way of declaration and initialization
        int [] marks = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("displaying the length of array:"+marks.length); // it will show the length of the array

//        Displaying the Array's content this method is called array traversal
for (int i = 0; i<= marks.length;i++){
    System.out.println("displaying array's content:\t"+i);
}

// showing in decrementing order -  the above content
        for (int i = marks.length; i>= 0;i--){
            System.out.println("displaying array's content decremented order:\t"+i);
        }

//        ------------------another method of showing the arrays content by for each loop ------------------
        for (int itisthe: marks     ) {
            System.out.println(itisthe);
        }

    }
}
