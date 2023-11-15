public class AbstractExp {
    public static void main(String[] args) {
        House myHouse = new House(5,1) {
            public void makeFood() {
                System.out.println("pizza");
            }
        };
        House yourHouse = new House(10,5) {
            public void makeFood(){
                System.out.println("Chicken");
            }
        };
        myHouse.makeFood();
        yourHouse.makeFood();
    }
}

abstract class House {
    int rooms;
    int floors=2;
    int windows=10;
    House(int givenRoom,int givenFloor){
        this.rooms = givenRoom;
        this.floors= givenFloor;
    }
    abstract public void makeFood();
}