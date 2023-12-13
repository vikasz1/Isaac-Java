public class Example15 {
    public static void main(String[] args) {
      //you can not create an object of interfaces and abstract classes; only well - defined classes can be instantiated
    }
}


interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

abstract class ThirdClass{
  abstract public void funnyMethod();
  public void sadMethod(){
    System.out.println("I am sad");
  }
}

class DemoClass extends ThirdClass implements FirstInterface, SecondInterface  {
  public void myMethod() {
    System.out.println("I am Hero..");
  }
  public void myOtherMethod() {
    System.out.println("I am Student...");
  }
  public void funnyMethod(){
    System.out.println("I laugh");
  }
}


