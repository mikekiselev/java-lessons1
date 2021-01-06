import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
       // int N = scanner.nextInt();

        int i = 1, r = 1;
        while (r < N) {

            System.out.println(r);
            i++;
            r = i * i;
        }
    }
}