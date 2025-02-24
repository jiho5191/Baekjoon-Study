package string;

import java.io.*;

// 문자와 문자열
public class problem_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(str.charAt(i-1));
    }
}
