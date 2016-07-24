package selenium.district;

import java.util.Random;

public class SomeClass2 {

    private static int POSITIVE = 0;
    private static int WITH_NEGATIVE = 1;


    public static void main(String args[]) {
        someMethod(8, 5, 1, 999, POSITIVE);
        someMethod(8, 5, 1, 5, POSITIVE);
        someMethod(8, 5, 1, 5, WITH_NEGATIVE);
    }

    public static void someMethod(int vertically, int horizontally, int valueFrom, int valueTo, int status) {

        int i, j;
        int[][] arr = new int[vertically][horizontally];

        Random random = new Random();

        for (i = 0; i < vertically; ++i) {
            for (j = 0; j < horizontally; ++j) {

                if (status == POSITIVE) {
                    arr[i][j] = random.nextInt(valueTo - valueFrom + 1) + valueFrom;
                } else if (status == WITH_NEGATIVE) {
                    arr[i][j] = random.nextInt(valueTo + valueFrom + 1) - valueFrom;
                }

                System.out.printf("%3d ", arr[i][j]);
            }

            System.out.println();
        }

        System.out.println("--------------");

        for (i = 0; i < vertically; ++i) {
            for (j = 0; j < horizontally; ++j) {
                if (i == j) {
                    System.out.printf("%3d ", arr[i][j]);
                }
            }
        }

        System.out.println("\n");

    }

}
