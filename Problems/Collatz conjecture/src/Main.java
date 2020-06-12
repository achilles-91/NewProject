import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        do {
            if (n == 1) {
                System.out.print(n);
                break;
            }
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 +1;
            }
        } while (true);



//        while (true) {
//            System.out.print(n + " ");
//            if (n % 2 == 0) {
//                n /= 2;
//            } else {
//                n = n * 3 + 1;
//            }
//            if (n == 1) {
//                System.out.println(n);
//                break;
//            }
//        }
    }
}