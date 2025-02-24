package string;

import java.io.*;

// 아스키 코드 변환
public class problem_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println((int)str.charAt(0));
    }
}
