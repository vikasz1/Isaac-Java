import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // type casting
        // int -> float
        // float -> int
        // $19.28 -> $19

        // float a = (float) 19.28;
        // int b = (int) 19.68;

        // System.out.println(a);
        // System.out.println(b);
        // ASCII - American standard code for information interchange

        // char c = 'd';
        // String d = "vikas";
        // System.out.println(d);

        // Operators
        // 1 - Arithmetic Operators
        // + , - , * , /, %

        // int age = 50;
        // int random = 6;
        // // 6/5 = 1.2
        // System.out.println((float) age / random);

        // int a = 4;
        // int b = 7;
        // System.out.println(b%a);

        // int a = 567;
        // a = a/10;
        // System.out.println(a);

        // Increment operator
        // ++
        // int a = 5;
        // a += 5;
        // System.out.println(a);

        // float a = 5.5f;
        // float b = 2.9f;
        // int c = (int) (a % b);
        // System.out.println(c);

        Scanner isaac = new Scanner(System.in);
        // int num = isaac.nextInt();
        // System.out.println("You inputted " + num);

        // String name = isaac.next(); //takes the first word
        // System.out.println(name);

        String name = isaac.nextLine(); // takes the whole Line
        System.out.println(name);

    }
}
