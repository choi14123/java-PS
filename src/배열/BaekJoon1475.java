package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String roomNumber = br.readLine();
        int[] arr = new int[10];

        for (int i = 0; i < roomNumber.length(); i++) {
            int number = roomNumber.charAt(i) - '0';
            arr[number]++;
        }

        arr[6] = (arr[6] + arr[9] + 1) / 2;

        int maxSets = 0;
        for (int i = 0; i < 9; i++) {
            if (arr[i] > maxSets) {
                maxSets = arr[i];
            }
        }

        bw.write(maxSets + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
