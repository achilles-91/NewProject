import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextByte();
        int count = 0;
        boolean stoped = false;

        for (int i = 1; i <= len && !stoped; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                System.out.print(i + " ");
                if (count == len) {
                    stoped = true;
                    break;
                }
            }
        }
    }
}




