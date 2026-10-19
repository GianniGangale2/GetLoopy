import java.util.Random;
import java.util.Scanner;

public class DieRollar {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String again;

        do {
            System.out.println();
            System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------");

            int roll = 0;
            int d1, d2, d3;

            // Keep throwing until all three dice show the same value
            do {
                roll++;
                d1 = rand.nextInt(6) + 1;
                d2 = rand.nextInt(6) + 1;
                d3 = rand.nextInt(6) + 1;
                System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", roll, d1, d2, d3, d1 + d2 + d3);
            } while (!(d1 == d2 && d2 == d3));

            System.out.println();
            System.out.println("Triple of " + d1 + "s after " + roll + (roll == 1 ? " roll!" : " rolls!"));
            System.out.print("Roll again? (y/n): ");
            again = in.nextLine().trim();
        } while (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}
