public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Outer loop for rows
            for (int j = 0; j < 15; j++) { // Inner loop for columns
                if (j < 5 || j >= 10) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
