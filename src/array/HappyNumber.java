package array;

public class HappyNumber {
    public static void main(String args[]) {
        System.out.println(new HappyNumber().isHappy(19));
    }

    public boolean isHappy(int n) {
        boolean res = false;
        int sqrSum = 0;
        while (true) {
            int mod = n % 10;
            int divd = n / 10;
            n = divd;
            sqrSum += Math.pow(mod, 2);
            if (sqrSum == 1) {
                res = true;
                return res;
            }
            if (divd==0) {
                n = sqrSum;
                sqrSum =0;
            }

        }
    }
}
