package BaekJoon;

import java.util.Scanner;

public class Letters_and_strings_27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();//문자입력

        int outputNum = scanner.nextInt(); //출력할 문자 순서
        System.out.println(str.substring(outputNum - 1, outputNum));

    }
}
//    문자와 문자열
//    시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	1024 MB	50951	34170	31501	68.402%
//        문제
//        단어
//        $S$와 정수
//        $i$가 주어졌을 때,
//        $S$의
//        $i$번째 글자를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
//        $S$가 주어진다. 단어의 길이는 최대
//        $1\,000$이다.
//
//        둘째 줄에 정수
//        $i$가 주어진다. (
//        $1 \le i \le \left|S\right|$)
//
//        출력
//         
//        $S$의
//        $i$번째 글자를 출력한다.