package polymorphism;

import java.util.Scanner;

public class MyApp extends AreaCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Exit");

            x = sc.nextInt();

            if (x == 1) {
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area = " + CalcArea(side));
            }
            else if (x == 2) {
                System.out.print("Enter length: ");
                double len = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                System.out.println("Area = " + CalcArea(len, breadth));
            }
            else if (x == 3) {
                System.out.print("Enter radius: ");
                float radius = sc.nextFloat();
                System.out.println("Area = " + CalcArea(radius));
            }
            else if (x == 4) {
                System.out.println("Exiting application...");
                break;
            }
            else {
                System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
