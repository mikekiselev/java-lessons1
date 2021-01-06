import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int eat = scanner.nextInt();
        int tickets = scanner.nextInt();
        int night = scanner.nextInt();

        System.out.println(days * eat + tickets * 2 + night * (days - 1));
    }
}