package kegiatan2;

public class FibonacciController {
    private String dataset[];
    private String target;
    private int lengthArr;


    public FibonacciController(String dataset[]) {
        this.dataset = dataset;
        this.lengthArr = dataset.length;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public int searchTarget() {
        int fibMMm0 = 0;
        int fibMMm1 = 1;

        int fibM = fibMMm0 + fibMMm1;

        while (fibM < lengthArr) {
            fibMMm0 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm0 + fibMMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = min(offset + fibMMm0, lengthArr - 1);

            if (dataset[i].compareToIgnoreCase(target) < 0) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm0;
                fibMMm0 = fibM - fibMMm1;
                offset = i;
            } else if (dataset[i].compareToIgnoreCase(target) > 0) {
                fibM = fibMMm0;
                fibMMm1 = fibMMm1 - fibMMm0;
                fibMMm0 = fibM - fibMMm1;
            } else return i;
        }

        if (fibMMm1 == 1 && dataset[offset + 1] == target) {
            return offset+1;
        }
        return -1;
    }
}
