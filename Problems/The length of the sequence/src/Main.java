import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(scanner.hasNext()) {
            count++;
            int n = scanner.nextInt();
            if (n == 0) {
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}