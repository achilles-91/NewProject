import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}