class TernaryOp {
    public static void main(String[] args) {
        double fnum = 0;
        double result = 0.0;

        // implementing signum function [-1,0,1]
        /*
         * if (fnum > 0.0)
         * result = 1.00;
         * else if (fnum==0.0)
         * result = 0.00;
         * else
         * result = -1.00;
         */

        result = (fnum > 0.0) ? 1.00 : (fnum == 0.0) ? 0.00 : -1.00;
        System.out.println(result);
    }
}