import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}