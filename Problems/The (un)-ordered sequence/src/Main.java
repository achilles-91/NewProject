import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int previousNum = scanner.nextInt();
        boolean ascending = true;
        boolean descending = true;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num >= previousNum) {
                descending = false;
            } else {
                ascending = false;
            }
            previousNum = num;
        }
        System.out.println(ascending || descending);
    }
}






/** drugo rjesenje
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int old;
//        boolean ascending = true;
//        boolean descending = true;
//
//        boolean result = true;
//
//        while(true) {
//            old = num;
//            num = scanner.nextInt();
//
//            if (num == 0) {
//                break;
//            }
//
//            if (num >= old && ascending) {
//                result = true;
//                descending = false;
//            } else if (num < old && ascending) {
//                result = false;
//                ascending = false;
//            }else if (num <= old && descending) {
//                result = true;
//                ascending = false;
//            }else if (num > old && descending) {
//                result = false;
//                descending = false;
//            } else {
//                result = false;
//            }
//        }
//        System.out.println(result);
//    }
//}
*/




/** prvo rjesenje
//        Scanner scanner = new Scanner(System.in);
//        boolean ascending;
//        boolean succeded = false;
//        int previousNum = scanner.nextInt();
//        boolean loop = true;
//
//        while (loop) {
//            int newNum = scanner.nextInt();
//            if (newNum == 0) {
//                succeded = true;
//                break;
//            }
//
//            if (newNum >= previousNum) {
//                ascending = true;
//                succeded = true;
//            } else {
//                ascending = false;
//                succeded = true;
//            }
//
//            previousNum = newNum;
//
//            while (ascending) {
//                int latestNum = scanner.nextInt();
//                if (latestNum == 0) {
//                    loop = false;
//                    break;
//                } else if (latestNum >= previousNum) {
//                    previousNum = latestNum;
//                    succeded = true;
//                } else {
//                    previousNum = Integer.MAX_VALUE;
//                    succeded = false;
//                }
//            }
//            while (!ascending) {
//                int latestNum = scanner.nextInt();
//                if (latestNum == 0) {
//                    loop = false;
//                    break;
//                } else if (latestNum <= previousNum) {
//                    previousNum = latestNum;
//                    succeded = true;
//                } else {
//                    previousNum = Integer.MIN_VALUE;
//                    succeded = false;
//                }
//            }
//        }
//        System.out.println(succeded);
//    }
//}
 */

