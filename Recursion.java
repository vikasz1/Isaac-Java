public class Recursion {
    public static void main(String[] args) {
        System.out.println(args[0]);
        beautiful(5,4);
    }
    //exponents 3*3*3*3 = 
    public static void beautiful(int a,int b){
        // 5^4 
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        System.out.println(result);
    }
}