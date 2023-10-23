package BaekJoon;


//        A+B - 3
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        각 테스트 케이스마다 A+B를 출력한다.
//
//        예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        2
//        5
//        7
//        17
//        7

import java.util.Scanner;

public class aPlusbMinus3_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt(); //입력할 A B 갯수 입력
        int[] numlist = new int[inputCount]; // 입력한 갯수만큼 배열 구성
        for (int i = 0; i < inputCount; i++) {
            int nX = scanner.nextInt(); // 값 입력
            int nY = scanner.nextInt();
            numlist[i] = nX + nY; //더하기 계산후 배열에 저장
        }
        //배열 순서대로 출력
        for (int i = 0; i < inputCount; i++) {
            System.out.println(numlist[i]);
        }

    }

}
