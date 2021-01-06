//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []data = new String[5];
        for (int i = 0; i < 5; i++) {
            data[i] = scanner.next();
        }

        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.", data[0], data[4]);
    }
}