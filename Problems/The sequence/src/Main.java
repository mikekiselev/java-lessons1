import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int param =0, count = 0;
        while (count < N && count < 1000 && param <= 30000) 
        {
            param = scanner.nextInt();
         
            if (param % 4 == 0 && param > max) {
                max = param;
            }

            count++;
        }
        System.out.println(max);
    }
}
