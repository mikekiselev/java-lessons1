import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= totalNum; i++) {
            for (int j = 1; j <= i; j++) {
                if (count > totalNum) break;
                System.out.printf("%d ", i);
                count++;

            }
            if (count > totalNum) break;
        }

    }
}