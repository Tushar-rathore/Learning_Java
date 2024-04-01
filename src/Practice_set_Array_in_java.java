import java.util.Arrays;

public class Practice_set_Array_in_java {
    public static void main(String[] args) {
//        question 1

        /*float [] ans = {12.3f,2.3f,3.6f,4.67f,5.2f};
        float sum = 0;
        for ( float data: ans) {
                sum +=  data;
            }
        System.out.println("the total of the data is: " +sum);*/

//        Question 2
//        float [] data = {12.3f,2.3f,3.6f,4.67f,5.2f};
//        float num = 2.3f;
//        boolean checking = false;
//        for (float show: data  ) {
//        if (num == show){
//            checking = true;
//            break;
//
//        }
//        }
//            if (checking){
//                System.out.println("the number is present");
//            }
//        else {
//            System.out.println("number is not present");
//        }

//        question 3
/*

        float [] ans = {12.3f,2.3f,3.6f,4.67f,5.2f};
        float sum = 0;
        for ( float data: ans) {
            sum +=  data;
        }
        System.out.println("the average of the data is: " + sum/ans.length);
*/

//        Question 4
/*
int [] [] arr = { {1,2,3},
                  {4,5,6}
};
int [] [] arr2 = { {2,6,13},
                    {4,8,16}
        };
int [] [] result = { {0,0,0},
                {0,0,0}
        };
        for (int i=0;i<arr.length;i++){ // row number of times
            for (int j=0;j<arr[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<arr.length;i++){ // row number of times
            for (int j=0;j<arr[i].length;j++) { // column number of time
                result[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" "); // Prints a new line
        }
*/

//        question 5
//program to reverse an array
       int[] arr = {1, 2, 3, 4, 5, 6,7,8,9,10};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp = 0;

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for (int element: arr) {
            System.out.println(element);
        }

//        question 6
//        to find the biggest value
//int [] arr = {1,2,3,4,5,6};
//int max = 0;
//        for (int printing: arr ) {
//            if (printing>max){
//                max=printing;
//            }
//        }
//        System.out.println("the maximum number is :\t" +max);

        // for min value  -
       /* int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the minimum element in this array is: "+ max);*/

//        question 7
/*

        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
*/



    }
}




