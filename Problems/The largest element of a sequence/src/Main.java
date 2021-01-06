import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int param;
        while (scanner.hasNext()) {
            param = scanner.nextInt();
        if ( param > max ) {
            max = param;
        }

    }
        System.out.println(max);
}
}
