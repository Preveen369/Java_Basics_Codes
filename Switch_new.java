class Switch_new {
    public static void main(String[] args) {
        String day = "Sunday";
        String result = "";
        // Switch as an expression(arrow, colon): 

        // DAY BASED ALARM - (approach 1)
        /*switch (day) {
            case "Saturday", "Sunday":
            System.out.println("6 AM");
            break;

            case "Monday":
            System.out.println("8 AM");
            break;
            
            default:
            System.out.println("7 AM");

        }*/


        // DAY BASED ALARM - (approach 2)
        switch (day) {
            case "Saturday", "Sunday" -> result = "6 AM";
            case "Monday" -> result ="8 AM";
            default -> result = "7 AM";
        } 
        System.out.println(result);


        // DAY BASED ALARM - (approach 3)
        /*result = switch (day) {
            case "Saturday", "Sunday" -> "6 AM";
            case "Monday" -> "8 AM";
            default -> "7 AM";
        };
        System.out.println(result);*/


        // DAY BASED ALARM - (approach 4)
        /*result = switch (day) {
            case "Saturday", "Sunday" : yield "6 AM";
            case "Monday" : yield "8 AM";
            default : yield "7 AM";
        };
        System.out.println(result);*/

    }
}
