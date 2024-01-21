package  src.main;

import src.main.java.algorithms.strings.StringManipulation;

import java.util.Scanner;

public class Main {
    public void solution() {

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt((0));
        System.out.println(StringManipulation.stringManipulationExample(str, c));
//        System.out.println(T.solution(str, c));
    }
}