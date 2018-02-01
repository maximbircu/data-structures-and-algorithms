package datastructures.datatypes.composite;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[1] = 2;

        String[] stringArray = {"just", "random", "words"};

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        for (int element : myArray) {
            System.out.print(String.format("%d ", element));
        }
        System.out.println();


        String[][] myMultiDimensionalArray = new String[10][10];

        for (int i = 0; i < myMultiDimensionalArray.length; i++) {
            for (int j = 0; j < myMultiDimensionalArray[i].length; j++) {
                myMultiDimensionalArray[i][j] = String.format("%d%d ", i, j);
            }
        }

        for (String[] row : myMultiDimensionalArray) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }

        int[] myArrayCopy = java.util.Arrays.copyOf(myArray, 10);

        java.util.Arrays.sort(myArray);

        System.out.println(java.util.Arrays.binarySearch(myArray, 11));
    }
}
