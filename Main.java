import java.util.Scanner;

    public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int n = in.nextInt();

        System.out.println("Fib of " + n + " by iteration is: " + new FibIteration().calculate_fib(n));
        System.out.println("Fib of " + n + " by formula is: " + new FibFormula().calculate_fib(n));

    }
}