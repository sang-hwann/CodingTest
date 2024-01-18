package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfNumbers_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSize = scanner.nextInt(); //숫자입력
        String num = scanner.next();
        scanner.close();

        int sum = 0;
        for (int i = 0; i < numSize; i++) {
            sum += num.charAt(i)-'0';//순서대로 문자를 더하기함 0이라는 문자를 빼서 아스키코드값을 알맞게 수정
        }
        System.out.print(sum);
    }

}

//    숫자의 합
//    시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//1 초	256 MB	239512	131963	108886	55.634%
//        문제
//        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//        출력
//        입력으로 주어진 숫자 N개의 합을 출력한다.
//
//        예제 입력 1
//        1
//        1
//        예제 출력 1
//        1
//        예제 입력 2
//        5
//        54321
//        예제 출력 2
//        15
//        예제 입력 3
//        25
//        7000000000000000000000000
//        예제 출력 3
//        7
//        예제 입력 4
//        11
//        10987654321
//        예제 출력 4
//        46