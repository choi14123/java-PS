package 연결리스트;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;

        while (!list.isEmpty()) {
            index = (index + k - 1) % list.size();
            int removed = list.remove(index);
            result.append(removed);

            if (!list.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
