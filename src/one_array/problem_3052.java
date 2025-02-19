package one_array;

import java.io.*;

// 나머지
public class problem_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] remain = new int[10];
        int count = 10;

        for (int i = 0; i < remain.length; i++) {
            int num = Integer.parseInt(br.readLine()) ;
            remain[i] = num % 42;
        }

        for (int i = 0; i < remain.length; i++) {
            boolean bl = false; // n번과 n+1번 나머지 비교
            for (int j = (i + 1); j < remain.length; j++) {
                if (remain[i] == remain[j]) {
                    bl = true;
                    count--;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
