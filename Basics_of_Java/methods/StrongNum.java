package methods;

public class StrongNum {

    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int d = temp % 10;

            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }

            sum += fact;
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println(n + " is a Strong Number");
        else
            System.out.println(n + " is not a Strong Number");
    }
}
