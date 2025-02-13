package loop;

import java.util.StringTokenizer;
import java.io.*;

// ctrl + D 누르면 종료
public class problem_10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write((a+b) + "\n");
        }

        bw.flush();
    }
}
