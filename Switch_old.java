class Switch_old {
    public static void main(String[] args) {
        int ch = 5;
        // Switch as a block (break, colon):

        switch (ch) {
            case 1: // case matching
                System.out.println("Monday");
                break; // prevents fall-through

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("No more days left!!");
        }
    }
}
