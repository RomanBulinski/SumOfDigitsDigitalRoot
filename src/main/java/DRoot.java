public class DRoot {

    public static int digital_root(int n) {
        int sum = getSum2(n);
        int sum2 = getSum2(sum);
        return sum2;
    }

    private static int getSum2(int sum) {
        String st2 = String.valueOf(sum);
        String[] stnums2 = st2.split("");
        int sum2 = 0;
        for (int i = 0; i < stnums2.length; i++) {
            sum2 = sum2 + Integer.valueOf(stnums2[i]);
        }
        return sum2;
    }
}
