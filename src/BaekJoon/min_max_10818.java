package BaekJoon;

import java.util.Scanner;

public class min_max_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 위한 scanner 객체 선언
        int inputNum = scanner.nextInt(); //입력할 갯수입력
        int minValue = Integer.MAX_VALUE; // 최소,최대값 받을 변수 ,처음부터 제일 낮은,높은수로 입력
        int maxValue = Integer.MIN_VALUE;
        int nowNum = 0;
        for (int i = 0; i < inputNum; i++) {
            nowNum = scanner.nextInt(); //숫자입력
            // 최소값 입력
            if (nowNum < minValue) {
                minValue = nowNum;
            }
            // 최대값 입력
            if (maxValue < nowNum) {
                maxValue = nowNum;
            }
        }
        System.out.println(minValue + " " + maxValue); //출력

    }
}

//        최소, 최대
//        문제
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
//        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//        출력
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//        예제 입력 1
//        5
//        20 10 35 30 7
//        예제 출력 1
//        7 35
