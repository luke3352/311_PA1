public class MergeSort {

    private int[] array;
    private int[] tempMergArr;
    private int length;
    public static int comparisons =0;
    public static void main(String a[]){

        int[] inputArr = {9,8,7,6,5,4,3,2,1};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("Comparisons: "+comparisons);
    }

    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            comparisons++;
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
            //comparisons++;
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            //comparisons++;
            if (tempMergArr[i] <= tempMergArr[j]) {
                //comparisons++;
                array[k] = tempMergArr[i];
                i++;
            } else {
                //comparisons++;
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            //comparisons++;
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}