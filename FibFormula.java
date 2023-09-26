public class FibFormula implements FindFib{

    @Override
    public int calculate_fib(int n) {
        double sqrt5 = Math.sqrt(5.0);
        double part1 = (1+sqrt5)/2.0;
        part1 = Math.pow(part1, n);
        double part2 = (1-sqrt5)/2.0;
        part2 = Math.pow(part2, n);
        double numerator = part1 - part2;
        return (int) (numerator/sqrt5);
    }
}
