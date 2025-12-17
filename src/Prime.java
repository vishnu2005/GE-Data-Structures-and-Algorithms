public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 1000:");
        int cnt=0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                cnt++;
                System.out.print(i + "\n");
            }
        }
        System.out.println(cnt);
    }
}
