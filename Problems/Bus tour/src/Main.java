import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        boolean hasCrashed = false;
        String myString = "Will not crash";

        for (int i = 1; i <= numOfBridges ; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight && !hasCrashed) {
                myString = "Will crash on bridge " + i;
                hasCrashed = true;
            }
        }
        System.out.println(myString);
    }
}