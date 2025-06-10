public class sumavg {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;

        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        double average = (double) sum / count;

        System.out.println("Sum of first 10 natural numbers: " + sum);
        System.out.println("Average of first 10 natural numbers: " + average);
    }
}

