import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int summ = 0, param;
        for (int i = 0; i < N; i++) {
            param = scanner.nextInt();
            if (param % 6 == 0) {
                summ += param;
            }

        }
        System.out.println(summ);
    }
}