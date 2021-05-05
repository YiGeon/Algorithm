package baekjoon;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isCon = false;
        int n = sc.nextInt();

            for (int i = 10; i < n; i++) {
                int con = i;
                String iToString = String.valueOf(i);
                for (int j = 0; j < iToString.length(); j++) {
                    con = con + Integer.parseInt(String.valueOf(iToString.charAt(j)));
                }
                if (con == n) {
                    isCon = true;
                    System.out.println(i);
                    break;
                }
            }
        if (!isCon) {
            System.out.println(0);
        }

    }
}
