package conditional;

import java.io.*;
import java.util.StringTokenizer;

// 알람 시계
public class problem_2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else {
            m += 15;
            if (h == 0) {
                h = 23;
            } else {
                h--;
            }
            System.out.println(h + " " + m);
        }
    }
}
