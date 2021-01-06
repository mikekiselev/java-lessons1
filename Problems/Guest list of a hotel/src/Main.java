//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []data = new String[8];
        for (int i = 0; i < 8; i++) {
            data[i] = scanner.next();
        }

        for (int i = 7; i >=0 ; i--) {
            System.out.println(data[i]);
        }
    }
}