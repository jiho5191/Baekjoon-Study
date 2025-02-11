package loop;

import java.io.*;

// 구구단
public class problem_2739 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for (int i = 1; i <= 9; i++) {
            int mul = num * i;
            System.out.println(num + " * " + i + " = " + mul);
        }

    }
}
