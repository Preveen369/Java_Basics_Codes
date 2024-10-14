class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=6) {
            System.out.println("Hello " + i);
            int j = 1;
            while (j<=3) {
                System.out.println("Hi " + j);
                j++;
            }  
            i++;
        }
        System.out.println("Bye " + i);    
    }
}
