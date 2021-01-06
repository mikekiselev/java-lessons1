import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int param;
        for (int i = 0; i < N; i++) {
            param = scanner.nextInt();
            if (param % 4 == 0 && param > max) {
                max = param;
            }

        }
        System.out.println(max);
    }
}