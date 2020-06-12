import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // prvo rjesenje
//        for (int i = 1;i <= 1000;i++) {
//            if (a * i * i * i + b * i * i + c * i + d == 0) {
//                System.out.println(i);
//            }
//        }

        // kvalitetnije rjesenje sa upotrebom Math.pow methoda
        for (int i =1; i <= 1000; i++) {
            if(a * Math.pow(i, 3) + b * Math.pow(i, 2) + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}