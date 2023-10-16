package BaekJoon;

import java.util.Scanner;

//문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class a_plus_b_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //문자입력 기능
        int x = scanner.nextInt(); // 문자입력후 변수에 저장
        int y = scanner.nextInt();// 문자입력후 변수에 저장2
        System.out.println(x+y); //입력받은 변수들 계산해서 출력

    }
}
