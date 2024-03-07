class MulArrau {
    public static void main(String[] args) {
        int arr1[][] = { { 2, 3, 4 }, { 4, 2, 1 }, { 1, 2, 3 } };
        int arr2[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 2, 1 } };

        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.println();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                {
                    System.out.print(arr3[i][j] + "");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }
}
