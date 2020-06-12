import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > a * b) {
            System.out.println("NO");
        } else if (k % a == 0 || k % b == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}












//        int lenght = scanner.nextInt();
//        int width = scanner.nextInt();
//        int take = scanner.nextInt();
//
//        int maxBreakOf = lenght * width;
//        int remainder = maxBreakOf - take;
//
//
//
//
//
//
//
//
//        boolean canBeTaken = maxBreakOf >= take;
////        boolean remainderChecked = maxBreakOf - take >= 0;
//        boolean remainderChecked = true;
//        if (maxBreakOf - take >= 0) {
//            if (maxBreakOf > 0) {
//                if (maxBreakOf % 2 == 0) {
//                   remainderChecked = true;
//                }
//            }
//        } else {
//            remainderChecked = false;
//        }
//
//
//
//        if (canBeTaken && remainderChecked) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//
////        if ((k <= (n * m) && k % (n * m) == 0)) {
////            System.out.println("YES");
////        } else {
////            System.out.println("NO");
////        }