public class Problem5 {
    public int Fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
