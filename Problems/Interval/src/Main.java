import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (-15 < a && a <= 12 || 14 < a && a < 17 || 19 <= a) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}