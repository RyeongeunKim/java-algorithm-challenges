package src.main.java.algorithms.strings;

import java.util.ArrayList;
import java.util.LinkedHashSet;

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

    // 특정 문자 뒤집기
    public static String reverseAlphabeticChars(String str) {
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

        return String.valueOf(chars);
    }

    // [중복문자제거] indexOf: O(n^2)
    public static String removeDuplicatesUsingIndexOf(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    // [중복문자제거] LinkedHashSet: O(n)
    public static String removeDuplicatesUsingSet(String str) {
        // LinkedHashSet을 사용하여 중복을 제거하고 순서 유지
        LinkedHashSet<Character> chars = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        // StringBuilder를 사용하여 반환할 문자열 생성
        StringBuilder answer = new StringBuilder();
        for (char c : chars) {
            answer.append(c);
        }

        return answer.toString();
    }
}