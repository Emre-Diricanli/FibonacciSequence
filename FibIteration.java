public class FibIteration implements FindFib{

    @Override
    public int calculate_fib(int n) {
        if(n==1 || n == 2){
            return 1;
        }else {
            int num1 = 1;
            int num2 = 1;
            int num3 = 0;
            for (int i = 3; i <= n; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            return num2;
        }
    }
}
