import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = new ArrayList<>();
        int param;
        while (scanner.hasNext()) {
            param = scanner.nextInt();
            if (param == 0) break;
            sequence.add(param);
        }

        if (sequence.get(sequence.size() - 1) == 0) {
            sequence.remove(sequence.size() - 1);
        }

        List<Integer> ascOrder = new ArrayList<>(sequence);
        Collections.sort(ascOrder);

        List<Integer> descOrder = new ArrayList<>(sequence);
        Collections.sort(descOrder, Collections.reverseOrder());

        boolean isOrdered = sequence.equals(ascOrder) || sequence.equals(descOrder);
        System.out.println(String.valueOf(isOrdered));
    }
}