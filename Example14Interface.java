public class Example14Interface {
    public static void main(String[] args) {
        Hero tony = new Hero();
        tony.play2();
    }
}

interface First{
    public void firstFuntion();
    public void play1();
}
interface Second{
    public void secondFunction();
    public void play2();
}

class Hero implements First, Second{
    public void firstFuntion(){ System.out.println("hi");}
    public void secondFunction(){ System.out.println("hello");}
    public void play1(){ System.out.println("bye");}
    public void play2(){ System.out.println("goodbye");}
}
