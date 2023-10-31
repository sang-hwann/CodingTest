package BaekJoon;

import java.util.Scanner;

public class counting_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 받기위해서 scanner객체 선언
        int scSize = scanner.nextInt(); //입력할 정수 갯수 입력
        int[] sc = new int[scSize]; // 갯수만큼 배열 크기 지정
        int count = 0;
        for (int i = 0; i < scSize; i++) {
            sc[i] = scanner.nextInt(); //각 배열에 값 입력
        }
        int searchNum = scanner.nextInt(); // 찾을 숫자 입력
        for (int i = 0; i < scSize; i++) {
            if (sc[i] == searchNum) {
                count++; //입력한 숫자와 동일한 경우 카운트숫자 증가
            }
        }
        System.out.println(count); //출력
    }
}
//        개수 세기
//        문제
//        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
//        셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며,
//        100보다 작거나 같다.
//        출력
//        첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
//        예제 입력 1
//        11
//        1 4 1 2 4 2 4 2 3 4 4
//        2
//        예제 출력 1
//        3
//        예제 입력 2
//        11
//        1 4 1 2 4 2 4 2 3 4 4
//        5
//        예제 출력 2
//        0