package one_array;

import java.io.*;
import java.util.StringTokenizer;

// x보다 작은 수 출력 -> 배열 안써도 돼서 안씀..
public class problem_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer array = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(array.nextToken());

            if (value < x) bw.write(value + " ");
        }

        bw.flush();
    }
}
