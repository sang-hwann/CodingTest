package BaekJoon;

import java.util.Scanner;

public class take_a_star_2_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 위한 Scanner 객체 선언
        int starNum = scanner.nextInt(); //출력할 별의 줄수 입력
        //세로줄 반복 , 세로줄의 최대값에서 줄여가면서 가로줄의 줄수와 같을때 문자를 출력
        for (int verline = starNum; 1 <= verline; verline--) {
            //가로줄 반복 , 줄과 칸의 갯수가 같아야해서 최대값이 세로줄과 같다
            for (int horline = 1; horline <= starNum; horline++) {
                //세로줄이 가로줄보다 작을때 별표기, 이외에는 빈칸 출력
                if (verline <= horline) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//        별 찍기 - 2
//        문제
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//        하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//        입력
//        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//        출력
//        첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//        예제 입력 1
//        5
//        예제 출력 1
//        *
//        **
//        ***
//        ****
//        *****