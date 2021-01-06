import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int param, large = 0, smaller = 0, perfect = 0;
        for (int i = 0; i < N; i++) {

            param = scanner.nextInt();

            if (param == 1) {
                large++;
            } else if (param == -1) {
                smaller++;
            } else perfect++;
        }
        System.out.printf("%d %d %d", perfect, large, smaller);
    }
}