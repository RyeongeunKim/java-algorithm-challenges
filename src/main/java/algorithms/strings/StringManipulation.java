package src.main.java.algorithms.strings;

public class StringManipulation {
    // 문자열 조작 관련 함수
    public static void stringManipulationExample() {
        String inputString = "Hello, World!";

        // 문자열의 길이 출력
        int length = inputString.length();
        System.out.println("문자열의 길이: " + length);

        // 대문자로 변환하여 출력
        String upperCaseString = inputString.toUpperCase();
        System.out.println("대문자로 변환: " + upperCaseString);

        // 소문자로 변환하여 출력
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("소문자로 변환: " + lowerCaseString);
    }
}