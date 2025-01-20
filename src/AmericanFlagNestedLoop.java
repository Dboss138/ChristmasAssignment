public class AmericanFlagNestedLoop {
    public static void main(String[] args) {
        // Upper part of the flag
        for (int i = 0; i < 3; i++) { // 3 rows for the top part
            for (int j = 0; j < 4; j++) {
                System.out.print("*"); // 4 stars
            }
            System.out.print("  "); // Space between
            for (int j = 0; j < 6; j++) {
                System.out.print("="); // 6 equal signs
            }
            System.out.println(); // Move to the next row
        }

        // Bottom part of the flag
        for (int i = 0; i < 3; i++) { // 3 rows for the bottom part
            for (int j = 0; j < 12; j++) {
                System.out.print("="); // 6 equal signs
            }
            System.out.println(); // Move to the next row
        }
    }
}
