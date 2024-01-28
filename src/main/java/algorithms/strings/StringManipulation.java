package src.main.java.algorithms.strings;

import java.util.ArrayList;

public class StringManipulation {
    // 문자 찾기
    public static int stringManipulationExample(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }

    // 대소문자 변환
    public static String swapCase(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    // 문장 속 단어
    public static String findLongestWord(String input) {
        String[] words = input.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    // 문자열 뒤집기(StringBuilder)
    public static ArrayList<String> reverseWithBuilder(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x:str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    // 문자열 뒤집기(직접 뒤집기)
    public static ArrayList<String> reverseManually(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x:str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length - 1;

            while(lt < rt) {
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
}