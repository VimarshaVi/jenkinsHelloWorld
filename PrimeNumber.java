package Applications;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is " + (isPrime ? "It is a prime number" : "It is not a Prime Number"));
    }
}
