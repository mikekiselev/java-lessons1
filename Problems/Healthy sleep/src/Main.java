import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] param = new int[3];
        for (int i = 0; i < 3; i++) {
            param[i] = scanner.nextInt();

        }

        if (param[2] < param[0]) {
            System.out.println("Deficiency");
        } else if (param[2] > param[1]) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}