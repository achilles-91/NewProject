import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int saved = number;
        int reversed = 0;

        while(true) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
            if (reversed == saved) {
                System.out.println("1");
                break;
            } else if (number < 1) {
                System.out.println("-1");
                break;
            }
        }

    }
}