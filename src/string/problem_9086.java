package string;

import java.io.*;

// 첫 글자와 마지막 글자 출력하는 프로그램
public class problem_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            bw.write(str.charAt(0));
            bw.write(str.charAt(str.length() - 1) + "\n");
        }

        bw.flush();
    }
}
