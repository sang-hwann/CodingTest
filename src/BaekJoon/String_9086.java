package BaekJoon;

import java.util.Scanner;

public class String_9086 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt(); //입력할 문자들 갯수

        scanner.nextLine(); //엔터소비? 잘모르겟음

        String[] str = new String[inputNum]; //문자들 갯수만큼 ,배열 생성
        for (int i = 0; i < inputNum; i++) {
            str[i] = scanner.nextLine(); //글 입력
        }
        for (int i = 0; i < inputNum; i++) {
            System.out.print(str[i].charAt(0));

            System.out.println(str[i].substring(str[i].length()-1, str[i].length()));
        }


    }
}


//        문자열
//        시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//        1 초	128 MB	56639	36583	33444	65.503%
//        문제
//        문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
//
//        입력
//        입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
//
//        출력
//        각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.