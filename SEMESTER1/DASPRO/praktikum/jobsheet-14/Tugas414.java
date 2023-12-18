public class Tugas414 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(12));
    }

    static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
