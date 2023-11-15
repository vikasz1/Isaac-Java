public class Example13 {
    public static void main(String[] args) {
        
    }
}

abstract class Animal{
    abstract void makeSound();

    public void sleep(){
        System.out.println("Zzz...");
    }
}

class Lion extends Animal{
    void makeSound(){
        System.out.println("Roar...");
    }
}