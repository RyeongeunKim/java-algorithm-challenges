package  src.main;

import src.main.java.algorithms.strings.StringManipulation;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            System.out.println(pos);
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;
//        String[] arr = str.split(" ");
//
//        for (String s:arr) {
//            if (s.length() > m) {
//                m = s.length();
//                answer = s;
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}