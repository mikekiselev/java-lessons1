import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextInt();
        double p = scan.nextInt() * .01;
        int k = scan.nextInt();
        int years = 0;
        while (m < k) {
            years++;
            m += m * p;
        }
        System.out.println(years);
    }
}