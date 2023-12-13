public class EnumExample {
    public static void main(String[] args) {
        Level level = Level.HARD;
        
        switch(level){
            case EASY:
                System.out.println("you are a noob");
                break;
            case MEDIUM:
                System.out.println("good bro");
                break;
            case HARD:
                System.out.println("legend");
                break;
        }

        // int a[] = {5,3,4,6};
        // for (int i : a) {
        //     System.out.println(i);
        // }

        for (Level l: Level.values()){
            System.out.println(l);
        }




    }
}

enum Level {
    EASY, MEDIUM, HARD
}