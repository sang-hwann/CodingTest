package BaekJoon;

import java.util.Scanner;

//         문제
//        시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//        출력
//        시험 성적을 출력한다.
public class TestScores_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //값을 입력받기위해 scanner 객체 선언
        int testScore = scanner.nextInt(); // 시험점수 입력후 변수에 저장
        if (100 < testScore) {
            testScore = 100; // 점수가 잘못 입력된경우 수정
        }
        if (testScore < 0) {
            testScore = 0; // 점수가 잘못 입력된경우 수정
        }
        //각 점수 조건에 맞춰서 출력
        if (90 <= testScore) {
            // testScore<100도 입력했엇는데 필요없는 조건임
            System.out.println("A");
        } else if (80 <= testScore) {
            System.out.println("B");
        } else if (70 <= testScore) {
            System.out.println("C");
        } else if (60 <= testScore) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
