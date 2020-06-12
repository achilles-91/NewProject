import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while(true) {
            n++;
            if (n % 2 == 0) {
                break;
            }
        }

        System.out.println(n);
    }
}