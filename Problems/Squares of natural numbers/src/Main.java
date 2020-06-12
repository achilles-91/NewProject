import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int i = 0;

        while (true) {
            i++;
            if (i * i > len) {
                break;
            }
            int square = i * i;
            System.out.println(square);
        }
    }
}