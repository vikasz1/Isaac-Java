import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hey User! Give me two numbers a and b:");

        Scanner vikas = new Scanner(System.in);
        int a = vikas.nextInt();
        int b = vikas.nextInt();

        System.out.println("Please tell me what you want to do:");
        System.out.println("1.Add \n 2.Sub \n 3.Mult \n 4.Div");

        int operation = vikas.nextInt();
        //switches are faster than if-else
        switch (operation) {
            case 1:
                System.out.println("Answer is " + (a + b));
                break;
            case 2:
                System.out.println("Answer is " + (a - b));
                break;
            case 3:
                System.out.println("Answer is " + (a * b));
                break;
            case 4:
                System.out.println("Answer is " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
