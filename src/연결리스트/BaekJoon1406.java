package 연결리스트;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class BaekJoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String initialString = br.readLine();
        LinkedList<Character> editor = new LinkedList<>();
        for (char c : initialString.toCharArray()) {
            editor.add(c);
        }

        ListIterator<Character> cursor = editor.listIterator();
        while (cursor.hasNext()) {
            cursor.next();
        }

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();

            if (command.startsWith("L")) {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
            } else if (command.startsWith("D")) {
                if (cursor.hasNext()) {
                    cursor.next();
                }
            } else if (command.startsWith("B")) {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            } else if (command.startsWith("P")) {
                char c = command.charAt(2);
                cursor.add(c);
            }
        }

        for (char c : editor) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
