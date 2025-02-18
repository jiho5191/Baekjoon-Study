package one_array;

import java.io.*;
import java.util.StringTokenizer;

// 공 넣기
public class problem_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N과 M 입력 받기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int i_basket = Integer.parseInt(st.nextToken());
            int j_basket = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int j = i_basket - 1; j < j_basket; j++) {
                basket[j] = k;
            }
        }

        for (int num : basket) {
            System.out.print(num + " ");
        }
    }
}
