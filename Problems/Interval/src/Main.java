import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int param = scanner.nextInt();
        if (
                (param > -15 && param <= 12) ||
                        (param > 14 && param < 17) ||
                        (param >= 19)
        ) {
            System.out.printf("True");
        } else {
            System.out.printf("False");
        }
    }
}