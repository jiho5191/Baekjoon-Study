package conditional;

import java.io.*;
import java.util.StringTokenizer;

public class problem_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;

        if (a == b && b == c) {
            result = 10000 + (a * 1000);
        } else if (a == b || b == c || a == c) {
            int same = (a == b || a == c) ? a : b;
            result = 1000 + (same * 100);
        } else {
            int max = Math.max(a, Math.max(b, c));
            result = max * 100;
        }
        System.out.println(result);
    }
}
