public class Recursion {

    static void printing(int n){
        if (n>0){
            printing(n-1);
        }
       System.out.println(n);

    }
    static int fact(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x*fact(x-1);

        }
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 5  ;
        int n = 10;
        System.out.println("The value of factorial x is: " + factorial(x));
        System.out.println("The value of factorial x is: " + factorial_iterative(x));
        System.out.println(fact(5));
        printing(n);
    }
}
