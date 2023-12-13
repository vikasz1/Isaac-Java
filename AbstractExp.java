public class AbstractExp {
    public static void main(String[] args) {
        House isaacHouse = new House(10, 4) {
            public void kitchen() {
                System.out.println("I want open kitchen");
            }
        };
        House vikasHouse = new House(10,4) {
            public void kitchen(){
                System.out.println("I want close kitchen.");
            }
        };

        isaacHouse.kitchen();
        vikasHouse.kitchen();
    }
}

abstract class House {
    int rooms;
    int floors;
    int windows;

    // constructor
    House(int givenRoom, int givenFloor) {
        this.rooms = givenRoom;
        this.floors = givenFloor;
    }

    abstract public void kitchen();
}