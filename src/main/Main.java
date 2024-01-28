package  src.main;

import src.main.java.algorithms.strings.StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x:str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length-1;
            while (lt<rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for (String x: StringManipulation.reverseManually(str)) {
            System.out.println(x);
        }
    }
}