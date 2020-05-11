package lab1;
public class Primes {

    public static void main(String[] args) {
        for (int j = 2; j <= 99; j++) {
            if (isPrime(j)) {
                System.out.print(j);
                System.out.print(' ');
            }
        }

    }

    public static boolean isPrime(int n) {
        int q = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                q += 1;
            }
        }
        if (q <= 2) {
            return true;
        }
        else {
            return false;
        }
    }
}