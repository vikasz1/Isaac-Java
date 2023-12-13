public class Recursion {
    public static void main(String[] args) {
        flower(1);
        int result = factorial(5);
        System.out.println(result);
    }
    public static void flower(int n){

        if (n==0) return;
        System.out.println(n);
        flower(n-1);
    }

    public static int factorial(int n){
        if (n==0) return 1;
        return n*factorial(n-1);
    }
    // Factorial
    // 5! = 5*4*3*2*1 = 120
    // 4! = 4*3*2*1 = 24

}