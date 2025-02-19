package one_array;

import java.io.*;

// 과제 안 낸 사람 찾기
public class problem_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] student = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine()) - 1;
            student[num] = true;
        }

        for (int i = 0; i < student.length; i++) {
            if (!student[i]) System.out.println(i+1);
        }
    }
}
