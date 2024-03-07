package SearchingandSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        int arr[] = { 5, 4, 3, 2, 4 };
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }
        System.out.println("after sorting");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }

}
