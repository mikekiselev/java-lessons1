import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int param;
        while (scanner.hasNext()) {
            param = scanner.nextInt();
            if (param == 0) break;
            if (param % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}