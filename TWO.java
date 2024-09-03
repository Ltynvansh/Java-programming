public class TWO {
    public static void main(String[] args) {
        // Create a 2D array with 3 rows and 4 columns
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Print the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Accessing an element (e.g., element at row 1, column 2)
        int value = array[1][2];
        System.out.println("\nElement at row 1, column 2: " + value);
    }
}
