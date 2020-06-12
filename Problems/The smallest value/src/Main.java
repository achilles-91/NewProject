import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long M = scanner.nextLong();
        long n = 1l;

        while (true) {
            n++;
            M /= n;
            if (M <= n) {
                System.out.println(n + 1);
                break;
            }
        }
        if (0 % 2 != 0) {
            System.out.printf("Go");
        }
    }
}