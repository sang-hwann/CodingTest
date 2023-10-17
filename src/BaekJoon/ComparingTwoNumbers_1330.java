package BaekJoon;

//         문제
//        두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//
//        출력
//        첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//        A가 B보다 큰 경우에는 '>'를 출력한다.
//        A가 B보다 작은 경우에는 '<'를 출력한다.
//        A와 B가 같은 경우에는 '=='를 출력한다.

import java.util.Scanner;

public class ComparingTwoNumbers_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //값 입력을 위해 Scanner객체 생성
        int A = scanner.nextInt(); //정수값 입력후 변수에 저장
        int B = scanner.nextInt(); //정수값 입력후 변수에 저장2

        if (A > B) {
            System.out.println(">"); //a가 클때
        } else if (A < B) {
            System.out.println("<"); //b가 클때
        } else {
            System.out.println("=="); //이외의 경우 , 이경우는 무조건 ==임
        }
    }
}
