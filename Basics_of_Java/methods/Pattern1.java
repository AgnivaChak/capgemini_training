package methods;

public class Pattern1 {
    public static void main(String[] args) {
    	int n = 3;

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp<=n-row; sp++) {
                System.out.print(" ");
            }

            for (int st = 1; st <= 2*row -1; st++) {
                System.out.print("*");
            } 

            System.out.println();
        }


        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp < row; sp++) {
                System.out.print(" ");
            }

            for (int st = 1; st <= 2*(n - row) + 1; st++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

