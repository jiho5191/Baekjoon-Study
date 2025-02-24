package string;

import java.io.*;

// 숫자의 합
public class problem_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // charAt()은 아스키 코드로 변환하므로 -'0' 해야 입력받은 숫자 값으로 나옴
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
