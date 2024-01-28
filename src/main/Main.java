package  src.main;

import src.main.java.algorithms.strings.StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public String solution(String str) {
        String answer;
        char[] chars = str.toCharArray();
        int lt = 0, rt = chars.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
              char temp = chars[lt];
              chars[lt] = chars[rt];
              chars[rt] = temp;
              lt++;
              rt--;
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(StringManipulation.reverseAlphabeticChars(str));
    }
}