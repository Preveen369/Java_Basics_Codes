class ForLoop {
    public static void main(String[] args) {
        // DAYS AND HOURS using for loop:

        // for loop (way-1)
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("  " + (j + 8) + " - " + (j + 9));
            }
        }

        /*// for loop (way-2)
        for (int i = 1; i <= 5;) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("  " + (j + 8) + " - " + (j + 9));
            }
            i++;
        }*/

        /*int i=1;
        // for loop (way-3)
        for (;i <= 5;) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("  " + (j + 8) + " - " + (j + 9));
            }
            i++;
        }*/
    }
}
