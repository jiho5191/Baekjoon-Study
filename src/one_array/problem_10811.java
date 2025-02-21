package one_array;

import java.io.*;
import java.util.StringTokenizer;

// 바구니 뒤집기
public class problem_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = 0;
            int first = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            while (first < end) {
                temp = basket[first];
                basket[first++] = basket[end];
                basket[end--] = temp;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
