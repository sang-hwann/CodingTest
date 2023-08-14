package ProgrammersCodingTest;

import java.util.Scanner;

//홀짝 구분하기
// 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을,
// 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
public class oddsAndEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //문자입력
        int n = sc.nextInt(); //입력문자 정수형태 변수로 입력
        if (n%2==1)   { //2로 나누고 나머지값이 1이남으면 홀수
            System.out.println(n+" is odd");
        }
        else { //위의 조건이 안맞으면 짝수
            System.out.println(n+" is even");
        }
    }
}
