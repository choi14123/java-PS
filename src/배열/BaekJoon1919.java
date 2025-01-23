package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int count = 0;

        int[] countArr1 = new int[26];
        int[] countArr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            countArr1[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            countArr2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            int compare = countArr1[i] - countArr2[i];
            if (compare != 0) {
                count += Math.abs(compare);
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
