import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        if (x == x1 || y == y1) {
            System.out.println("YES");
        } else if (x - x1 == y - y1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}