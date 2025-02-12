package loop;

import java.io.*;
import java.util.StringTokenizer;

// 영수증
public class problem_25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total_price = Integer.parseInt(br.readLine());
        int total_count = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < total_count; i++) {
            String string = br.readLine();
            StringTokenizer st = new StringTokenizer(string, " ");
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            sum += price * count;
        }

        if (total_price == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
