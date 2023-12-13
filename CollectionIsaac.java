import java.util.ArrayList;
import java.util.Scanner;

public class CollectionIsaac {
    public static void main(String[] args) {

        // static allocation array
        // integer array
        // int arr[] = {2,3,1,5,6,22,11};
        // int myArr[] = new int[10];
        // myArr[9] = 100;
        // myArr[10] = 200;

        // System.out.println(Arrays.toString(myArr));

        // String array
        // String names[] = {"Vikas", "Isaac", "Naven","John"};

        // ArrayList<Integer> myarr = new ArrayList<Integer>(1000);
        // myarr.add(5);
        // myarr.add(5);
        // myarr.add(100, 1);

        // ArrayList<String> allNames = new ArrayList<String>(10);
        // allNames.add("vikas");
        // allNames.add("shiv");
        // allNames.add("isaac");

         ArrayList<Boolean> allNames = new ArrayList();
        allNames.add(4>5);
        allNames.add(true);
        allNames.add("Vikas"=="vikas");

        System.out.println(allNames);

    }
}
