import java.beans.PropertyEditorSupport;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextBoolean();
        int result = 0;

        while (H > 0) {
            H -= A;
            result++;
            if (H < 1) break;
            H += B;
        }

        System.out.println(result);
    }
}