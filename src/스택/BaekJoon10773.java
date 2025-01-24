package 스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }

        while (!stack.isEmpty()) {
            count += stack.pop();
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
