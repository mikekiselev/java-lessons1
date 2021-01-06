import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int param, summ = 0;
        while (scanner.hasNext()) {
            param = scanner.nextInt();
            summ += param;
            if(param ==0) break;
        }
        System.out.println(summ);
    }
}