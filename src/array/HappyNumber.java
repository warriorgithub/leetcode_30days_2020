package array;

public class HappyNumber {
    public static void main(String args[]) {
        System.out.println(new HappyNumber().isHappy(100));
    }

    public boolean isHappy(int n) {
        boolean res = false;
        while (true) {
            double sqrSum = 0;
            int mod = n % 10;
            int divd = n / 10;
            n = divd;
            sqrSum += Math.pow(mod, 2) + Math.pow(divd, 2);
            if (sqrSum == 1) {
                res = true;
                return res;
            }
        }
    }
}
