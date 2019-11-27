package kegiatan1;

public class BinarySearchController {
    private Number[] data;
    private Number target;
    private int indeks;

    public int getIndeks(){
        return indeks;
    }
    public BinarySearchController(Number[] data) {
        this.data = data;
        this.indeks=-1;
    }

    public void setTarget(Number target) {
        this.target = target;
    }

    public boolean isTargetFound() {
        Number[] resultSorting = sortingData();

        int low = 0;
        int high = resultSorting.length - 1;

        for (int i = 0; i < data.length; i++) {
            System.out.println(resultSorting[i]);
        }
        while (high >= low) {
            int middle = (low + high) / 2;

            if (resultSorting[middle].equals(target)) {
                indeks=middle;
                return true;
            }
            if (resultSorting[middle].doubleValue() < target.doubleValue()) {
                low = middle + 1;
            }
            if (resultSorting[middle].doubleValue() > target.doubleValue()) {
                high = middle - 1;
            }

        }

        return false;

    }

    private Number[] sortingData() {
        Number[] dataToSort = data;

        int idxI, idxJ, length = dataToSort.length;

        for (idxI = 0; idxI < length; idxI++) {
            for (idxJ = 0; idxJ < length; idxJ++) {
                if (dataToSort[idxJ].doubleValue() > dataToSort[idxI].doubleValue()) {
                    Number c = dataToSort[idxI];
                    dataToSort[idxI] = dataToSort[idxJ];
                    dataToSort[idxJ] = c;
                }
            }
        }

        return dataToSort;
    }




}
