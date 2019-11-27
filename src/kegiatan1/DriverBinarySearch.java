package kegiatan1;

import java.util.Scanner;

public class DriverBinarySearch {
    public static void main(String[] args) {

        Number[] dataku={2.3,2,1034923,1};
        BinarySearchController binarySearchController = new BinarySearchController(dataku);
        binarySearchController.setTarget(1034923);
        boolean isFound=binarySearchController.isTargetFound();

        if (isFound){
            System.out.println("found");
            System.out.println("found in indeks "+binarySearchController.getIndeks());
        }
        else {
            System.out.println("not found");
        }

    }
}
