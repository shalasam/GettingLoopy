public class ElaborateInitial {
    public static void main(String[] args) {
        // Rows and columns for the pattern
        int rows = 9;
        int columns = 17;

        // Loop to iterate through each row
        for (int i = 0; i < rows; i++) {

            // Loop to iterate through each column
            for (int j = 0; j < columns; j++) {

                // Condition to print 'S' pattern
                if ((i == 0 || i == 4 || i == 8) && (j > 0 && j < 16)) {
                    System.out.print("*");
                } else if ((i < 4 && i > 0) && (j == 0)) {
                    System.out.print("*");
                } else if ((i > 4 && i < 8) && (j == 16)) {
                    System.out.print("*");
                } else if ((i == 1 && j == 0) || (i == 3 && j == 16)) {
                    System.out.print("*");
                } else if ((i == 2 || i == 6) && j == 0) {
                    System.out.print("*");
                } else if ((i == 7 && j == 16) || (i == 5 && j == 16)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}