package BaekJoon;

import java.util.Scanner;

public class number_less_than_x_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 위해 scanner객체 선언
        int NumCount = scanner.nextInt(); //받은 숫자 갯수입력
        int minValue = scanner.nextInt(); //최소값 입력
        int[] nums = new int[NumCount]; // 배열 선언
        int minNumsCount = 0; //최소값들이 들어갈 배열의 크기
        for (int i = 0; i < NumCount; i++) {
            nums[i] = scanner.nextInt(); // 각각 숫자입력
            if (nums[i] < minValue) {
                minNumsCount++; //최소값만큼 증가
            }
        }

        int[] minNums = new int[minNumsCount]; //최소값들의 배열 선언
        int minListCount = 0; // 최소값들의 배열 순서
        //최소값들을 배열에 저장
        for (int i = 0; i < NumCount; i++) {
            if (nums[i] < minValue) {
                minNums[minListCount] = nums[i]; //최소값 저장
                minListCount++; // 순서수정
            }
        }
        //츨력부분
        for (int i : minNums){
            System.out.print(i+" ");
        }
    }
}
//        X보다 작은 수
//        문제
//        정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//        둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//        출력
//        X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//        예제 입력 1
//        10 5
//        1 10 4 9 2 3 8 5 7 6
//        예제 출력 1
//        1 4 2 3