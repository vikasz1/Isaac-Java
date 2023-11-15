public class Challenge2 {
    public static void main(String[] args) {
        Hospital childrenHospital = new Hospital("New Life", 5, 10);
        childrenHospital.ICU();
    }
}

class Hospital{
    String name;
    int doctorCount;
    int patients;
    int rooms;
    int ambulances;

    public void ICU(){
        System.out.println("I have ICUs");
    }
    
    Hospital(String name, int doctorCount, int rooms){
        this.name = name;
        this.doctorCount = doctorCount;
        this.rooms = rooms;
    }

}