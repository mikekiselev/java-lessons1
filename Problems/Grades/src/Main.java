import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int param;
        int[] grade = new int[]{0, 0, 0, 0, 0, 0};
        for (int i = 0; i < N; i++) {
            param = scanner.nextInt();
            grade[param]++;

        }
        System.out.printf("%d %d %d %d", grade[2], grade[3], grade[4], grade[5]);
    }
}