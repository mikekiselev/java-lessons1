import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input;
        do {
            input = scanner.nextInt();
            if (input != 0) count++;
        } while (input != 0);
        System.out.println(count);
    }
}