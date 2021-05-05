package baekjoon;

import java.util.Scanner;

public class P7568 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] people = new int[n][2];

        for (int i = 0; i < n; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int rating = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rating++;
                }
            }
            System.out.println(rating);
        }



    }
}
