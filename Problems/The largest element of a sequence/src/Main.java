import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNum = Integer.MIN_VALUE;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > largestNum) {
                largestNum = n;
            }
        }
        System.out.println(largestNum);
    }
}