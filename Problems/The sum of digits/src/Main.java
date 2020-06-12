import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int first = n % 10;
        n /= 10;
        int second = n % 10;
        n /= 10;
        System.out.println(n + first + second);

    }
}