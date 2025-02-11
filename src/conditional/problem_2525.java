package conditional;

import java.util.Scanner;

// 오븐 시계
public class problem_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        m += time;

        h += m / 60;
        m = m % 60;

        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}
