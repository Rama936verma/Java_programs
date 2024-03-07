public class MergeSortWithoutFunction {

    public static void main(String[] args) {
        int[] arr = { 7, 4, 11, 1, 9 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int leftLength = middle - left + 1;
        int rightLength = right - middle;

        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < rightLength; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}