package one_array;

import java.io.*;
import java.util.StringTokenizer;

// 공 바꾸기
public class problem_10813 {
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
            int i_basket = Integer.parseInt(st.nextToken()) - 1;
            int j_basket = Integer.parseInt(st.nextToken()) - 1;
            int temp = 0;

            temp = basket[i_basket];
            basket[i_basket] = basket[j_basket];
            basket[j_basket] = temp;
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
