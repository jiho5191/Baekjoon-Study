package loop;

import java.io.*;
import java.util.StringTokenizer;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
public class problem_10950 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();
        int num = Integer.parseInt(string);
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[i] = a + b;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
