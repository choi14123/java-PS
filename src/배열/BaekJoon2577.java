package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String totalNumber = String.valueOf(a * b * c);

        int arr[] = new int[9];

        for (int i = 0; i < totalNumber.length(); i++) {
            int check = totalNumber.charAt(i) - '0';
            arr[check]++;
        }

        for (int i = 0; i < 9; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        br.close();
    }
}
