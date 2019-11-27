package kegiatan2;

import java.util.Arrays;

public class DriverFibonacci {
    public static void main(String[] args) {
        String[] kata={"Universitas","Muhammadiyah","Malang","dasd","asddsf"};
        String target="Universitas";
        Arrays.sort(kata);

        System.out.println("result : "+Arrays.toString(kata));

        FibonacciController fibonacciController = new FibonacciController(kata);
        fibonacciController.setTarget(target);

        int result=fibonacciController.searchTarget();

        if (result!=-1){
            System.out.println("target found at "+result);
        }
        else {
            System.out.println("not found");
        }
    }
}
