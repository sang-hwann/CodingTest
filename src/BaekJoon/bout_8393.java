package BaekJoon;
        //합
//        문제
//        n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//        출력
//        1부터 n까지 합을 출력한다.
//        예제 입력 1        3
//        예제 출력 1        6
import java.util.Scanner;

public class bout_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); //값입력
        int sum = 0;
        //입력한 숫자가 될떄까지 반복 및 더하기 적용
        for (int i = 1; i <= num; i++) {
            sum += i; //한 변수에 모든 값 저장
        }
        System.out.println(sum);
    }
}
