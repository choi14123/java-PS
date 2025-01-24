package 큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }

        for (int i = 0; i < n; i++) {
            if (queue.size() == 1) {
                bw.write(String.valueOf(queue.poll()));
            } else {
                queue.remove();
                int backNumber = queue.remove();
                queue.add(backNumber);
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}