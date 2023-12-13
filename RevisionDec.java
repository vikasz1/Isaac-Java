public class RevisionDec {
    public static void main(String[] args) {
        // creating object
        Human goat = new Human("Ronaldo", 38);
        
        goat.multiply(3, 4);
        goat.multiply(3, 4, 6);

        // goat.name = "Ronaldo";
        // Classname objectname = new Contructor()
    }
}

// Object Oriented Programming...
// method overloading
class Human {
    String name;
    int age;

    Human(String givenName, int givenAge) {
        this.name = givenName;
        this.age = givenAge;
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }
    // overloaded method
    public void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}