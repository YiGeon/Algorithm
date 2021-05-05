package baekjoon;

import java.util.*;

public class P2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> dwarves = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            dwarves.add(sc.nextInt());
            sum += dwarves.get(i);
        }
        Collections.sort(dwarves);

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - dwarves.get(i) - dwarves.get(j) == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) {
                            continue;
                        }
                        System.out.println(dwarves.get(k));
                    }
                   return;
                }

            }

        }
    }
}
