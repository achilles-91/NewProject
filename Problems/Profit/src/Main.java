import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double current = scanner.nextDouble();
        double percent = scanner.nextDouble() / 100;
        double toReach = scanner.nextDouble();
        int numOfYears = 0;

        while (current < toReach) {
            current +=  current * percent;
            numOfYears++;
        }
        System.out.println(numOfYears);
    }
}