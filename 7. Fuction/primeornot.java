public class primeornot {
    // only for n>=2
    public static boolean isPrime(int n) {
        // corner cases
        // 1
        if (n == 1) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                // break;
                return false;

            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(1));

    }
}
