package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon11328 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            int[] count1 = new int[26];
            int[] count2 = new int[26];

            for (char c : str1.toCharArray()) {
                count1[c - 'a']++;
            }
            for (char c : str2.toCharArray()) {
                count2[c - 'a']++;
            }

            boolean isAnswer = true;
            for (int j = 0; j < 26; j++) {
                if (count1[j] != count2[j]) {
                    isAnswer = false;
                    break;
                }
            }

            if (isAnswer) {
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
