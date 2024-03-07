class Insertion {
    /*
    *******************insertion me shifting hoti****************************
     * best complexity=n
     * 
     * stable
     * data structure array
     */
    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 9, 11 };
        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 4; j++) {
                /*
                 * temp = arr[j];
                 * arr[j] = arr[i];
                 * arr[i] = temp;
                 */

                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    for (int k = j; k > i; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[i] = temp;
                }

            }

        }

        System.out.println("after sorting:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);

        }

    }
}