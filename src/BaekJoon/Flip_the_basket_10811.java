package BaekJoon;

import java.util.Scanner;

public class Flip_the_basket_10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 받은 scanner 선언
        int basketNum = scanner.nextInt(); // 바구니의 갯수 입력
        int[] baskets = new int[basketNum]; //값을 받을 배열값 구성
        int flipNum = scanner.nextInt(); //뒤집을 값 입력하는 횟수


        int flipStartNum = 0; //뒤집기 시작 값
        int flipEndNum = 0; //뒤집기 끝 값

        //바구니 , 배열에 값 기본적으로 입력
        for (int i = 0; i < basketNum; i++) {
            baskets[i] = i + 1; // 배열에 값 입력
        }

        int differenceNum = 0;
        int tempNum = 0;

        //뒤집을 바구니들 입력
        for (int i = 0; i < flipNum; i++) {
            flipStartNum = scanner.nextInt();
            flipEndNum = scanner.nextInt();
            flipStartNum = flipStartNum - 1;
            flipEndNum = flipEndNum - 1;

            //뒤집기 , 뒤집을때 횟수가 절반만 뒤집음 ,
            for (int j = flipStartNum; j <= (flipEndNum+flipStartNum)/2; j++) {
                differenceNum = j - flipStartNum;
                tempNum = baskets[j]; //시작 값 임시 저장
                baskets[j] = baskets[flipEndNum - differenceNum]; //값 뒤집기
                baskets[flipEndNum - differenceNum] = tempNum;
            }
        }

        for (int i = 0; i < baskets.length; i++) {
            System.out.print(baskets[i] + " ");
        }

    }
}




//    바구니 뒤집기
//문제
//        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
//
//        도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
//
//        바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//
//        둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
//
//        도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
//
//        출력
//        모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
//
//        예제 입력 1
//        5 4
//        1 2
//        3 4
//        1 4
//        2 2
//        예제 출력 1
//        3 4 1 2 5