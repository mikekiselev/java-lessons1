import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0, param;
        for (int i = 0; i < 3; i++) {
            param = scanner.nextInt();
            result += (param / 2 + param % 2);
        }
        System.out.println(result);
    }
}