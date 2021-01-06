import java.util.*;

/**
 * Failed test #2 of 5. Wrong answer
 *
 * This is a sample test from the problem statement!
 *
 * Test input:
 * 211 5
 * 871 205 123 871 1681
 * Correct output:
 * Will crash on bridge 2
 *
 * Your code output:
 * Will not crash
 */
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        String param = "Will not crash";
        Integer i = 0; // Crashed Bridges!!
        while (scanner.hasNext()) {
            int bridgeHeight = scanner.nextInt();
            i += 1;
            if (busHeight >= bridgeHeight) {

                param = "Will crash on bridge" + " " + i.toString();

                break;
            }

        }

        System.out.println(param);
    }
}
