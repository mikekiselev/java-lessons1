import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int param, summ = 0;
        while (scanner.hasNext() && summ <= 1000) {
            param = scanner.nextInt();
            if (param == 0) {
                System.out.println(summ);
                break;
            }
            summ += param;
            if (summ >= 1000) {
                System.out.println(summ - 1000);
                break;
            }
        }

    }
}