package 연결리스트;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class BaekJoon5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNumber = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNumber; i++) {
            String str = br.readLine();

            LinkedList<Character> linkedList = new LinkedList<>();
            ListIterator<Character> cursor = linkedList.listIterator();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '<') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                } else if (c == '>') {
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                } else if (c == '-') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                } else {
                    cursor.add(c);
                }
            }

            StringBuilder result = new StringBuilder();
            for (char ch : linkedList) {
                result.append(ch);
            }

            bw.write(result.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
