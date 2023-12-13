public class Challenge {
    public static void main(String[] args) {
        Birds cuteBirds = new Birds();
        cuteBirds.play();
       
    }
}

class Animal {
    String name;
    String color;

    public void play(){
        System.out.println("This animal plays");
    }
    public void play(String name){
        System.out.println(name+" plays");
    }
    public void movement(){
        System.out.println("Animal walks on his/her feet.");
    }
}

class Birds extends Animal{
    // overriding method
    public void movement(){
        System.out.println("Bird is flying.");
    }
    public void makeSound(){
        System.out.println("Chirp Chirp");
    }

}