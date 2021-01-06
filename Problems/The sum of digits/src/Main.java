import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int summ = 0;
        summ += a % 10;
        a /= 10;
        summ += a % 10;
        a /= 10;
        summ += a;
        System.out.println(summ);
    }
}