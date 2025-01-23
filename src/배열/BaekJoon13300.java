package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon13300 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int arr[][] = new int[2][7];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[s][y]++;
        }

        double roomCount = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 6; j++) {
                if (arr[i][j] > 0) {
                    roomCount += Math.ceil((double) arr[i][j] / k);
                }
            }
        }

        bw.write(String.valueOf((int) roomCount));
        bw.flush();
        bw.close();
        br.close();
    }
}
