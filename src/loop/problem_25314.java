package loop;

import java.io.*;

// 코딩은 체육과목입니다
public class problem_25314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = num / 4;

        for (int i = 0; i < result; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
