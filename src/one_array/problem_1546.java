package one_array;

import java.util.StringTokenizer;
import java.io.*;

// 평균
public class problem_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] score = new int[n];
        int max = 0;
        int sum = 0;
        double avr = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (max < score[i]) max = score[i];
            sum += score[i];
        }

        avr = (double) sum / n * 100 / max;
        System.out.println(avr);
    }
}
