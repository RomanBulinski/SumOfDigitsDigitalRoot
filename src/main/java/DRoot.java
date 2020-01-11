import java.util.Arrays;

public class DRoot {

    public static int digital_root(int n) {
        int sum = createSumFormNumber(n);
        int secondSum = createSumFormNumber(sum);
        return secondSum;
    }

    private static int createSumFormNumber(int sum) {
        String[] numbers = String.valueOf(sum).split("");
        return Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
    }

}
