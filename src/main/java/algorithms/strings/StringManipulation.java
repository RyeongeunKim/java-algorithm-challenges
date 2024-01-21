package src.main.java.algorithms.strings;

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
}