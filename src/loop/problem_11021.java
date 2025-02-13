package loop;

import java.io.*;
import java.util.StringTokenizer;

public class problem_11021  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 여러 문자열을 효율적으로 조합
        // StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + (a+b) + "\n");

            // sb.append("case #").append(i).append(": ").append(a + b).append("\n");
            // bw.write(sb.toString());
        }

        bw.flush();
    }
}
