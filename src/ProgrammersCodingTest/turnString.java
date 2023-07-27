package ProgrammersCodingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class turnString {
    //    문제 설명 문자열 돌리기
//    문자열 str이 주어집니다.
//    문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//    입력 #1
//    abcde
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 문자입력
        String str = sc.next(); //받은 문자를 문자열 변수에 저장
        for (int i=0; i < str.length(); i++) {
            //문자열의 순서대로 반복문 실행
            System.out.println(str.charAt(i)); //순서의 문자를 출력
        }
    }
}
