import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long products = 1L;

        for (long i = a; i < b; i++) {
            products *= i;
        }
        System.out.println(products);
    }
}