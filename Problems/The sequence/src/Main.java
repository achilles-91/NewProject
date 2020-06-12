import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = scanner.nextInt();
        int largestNum = Integer.MIN_VALUE;
        int count = 0;

        while(count < numOfInputs) {
            count++;
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > largestNum) {
                largestNum = num;
            }
        }
        System.out.println(largestNum);
    }
}