package one_array;

import java.io.*;
import java.util.StringTokenizer;

public class problem_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int find = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());

            if (array[i] == find) result += 1;
        }

        System.out.println(result);
    }
}
