public class multidimentional_arrays {
    public static void main(String[] args) {




            int [] marks; // A 1-D Array
            int [][] flats; // A 2-D Array
            flats = new int [2][3];
            flats[0][0] = 1;
            flats[0][1] = 2;
            flats[0][2] = 3;
            flats[1][0] = 10;
            flats[1][1] = 20;
            flats[1][2] = 30;

            // Displaying the 2-D Array (for loop)
            System.out.println("Printing a 2-D array using for loop");
            for(int i=0;i<flats.length;i++){
                for(int j=0;j<flats[i].length;j++) {
                    System.out.print(flats[i][j]);
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
    }

