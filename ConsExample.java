public class ConsExample {
    public static void main(String[] args) {
        Human demo1 = new Human(0);
        System.out.println("Eye count " + demo1.eyeCount);
    }
}

class Human {
    int eyeCount = 2;
    int legsCount = 2;

    Human() {
        System.out.println("I am no arg constructor");
    }

    Human(int givenEyes) {
        if (givenEyes > 2) {
            this.eyeCount = 2;
        } else {
            this.eyeCount = givenEyes;
        }
    }

}
