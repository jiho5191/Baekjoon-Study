package one_array;

import java.io.*;

public class problem_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int num = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) {
                max = arr[i];
                num = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(num);

    }
}
