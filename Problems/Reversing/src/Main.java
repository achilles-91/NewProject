import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int toOutput = 0;

        while (true) {
            toOutput *= 10;
            toOutput += n % 10;
            n /= 10;
            if (n <= 0) {
                break;
            }
        }
        System.out.println(toOutput);
    }
}