package BaekJoon;

import java.util.Scanner;

public class AplusB_4_10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 위한 Scanner 객체선언
        int x = 0; //값 입력받을 변수 2개 선언
        int y = 0;
        //입력 여부확인
        while (scanner.hasNext()){
            x = scanner.nextInt();
            y = scanner.nextInt();

            System.out.println(x+y);
        }
        scanner.close();
    }
}
//        A+B - 4
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//        입력
//        입력은 여러 개의 테스트 케이스로 이루어져 있다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
//                (0 < A, B < 10)
//        출력
//        각 테스트 케이스마다 A+B를 출력한다.
//        예제 입력 1
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