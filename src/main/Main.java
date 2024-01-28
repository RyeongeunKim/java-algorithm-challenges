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
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
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
        for (String x: StringManipulation.reverseStrings(str)) {
            System.out.println(x);
        }
    }
}