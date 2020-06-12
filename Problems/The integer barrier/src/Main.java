import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean hasNext = scanner.hasNext();

        while(hasNext) {
            int x = scanner.nextInt();
            sum += x;

            if (x == 0) {
                System.out.println(sum);
                break;
            } else if (sum < 1000) {
                continue;
            } else if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
//            sum += x;
        }
    }
}