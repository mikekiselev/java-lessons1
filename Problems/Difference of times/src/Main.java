import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] param = new int[3];
        for (int i = 0; i < 3; i++) {
            param[i] = scanner.nextInt();

        }
        int p1 = param[0] * 3600 + param[1] * 60 + param[2];

        for (int i = 0; i < 3; i++) {
            param[i] = scanner.nextInt();

        }

        int p2 = param[0] * 3600 + param[1] * 60 + param[2];
        System.out.println(p2 - p1);
    }


}