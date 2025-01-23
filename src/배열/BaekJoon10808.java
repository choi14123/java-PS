package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            bw.write(count[i] + " ");
        }
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}