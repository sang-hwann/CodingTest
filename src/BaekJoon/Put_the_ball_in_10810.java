package BaekJoon;

import java.util.Scanner;

public class Put_the_ball_in_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력을 위한 Scanner 선언
        int maxValue = sc.nextInt(); //입력되는 최대값
        int valueCount = sc.nextInt(); //입력횟수
        int[] totalListVaule = new int[maxValue]; //입력된 값들 위치를 위한 배열선언
        int startNum = 0; //시작 바구니
        int endNum = 0; // 끝바구니
        int inputNum = 0; //넣을 숫자입력
        //입력할 횟수만큼 반복
        for (int i = 0; i < valueCount; i++) {
            startNum = sc.nextInt()-1; //시작값 입력 ,배열은 0부터 시작이 -1적용
            endNum = sc.nextInt()-1; //끝값 입력
            inputNum = sc.nextInt();//입력할 숫자 입력
            //시작 바구니에서 끝바구니까지 배열 사용
            for (int j = startNum; j <= endNum; j++) {
                totalListVaule[j] = inputNum; //해당위치에 입력한 값 입력
            }
        }

        //입력한 바구니 출력
        for (int i = 0; i < maxValue; i++) {
            System.out.print(totalListVaule[i] + " ");
        }

    }
}
//        공 넣기
//        문제
//        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
//        도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
//        공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//        둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
//        도현이는 입력으로 주어진 순서대로 공을 넣는다.
//        출력
//        1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.
//        예제 입력 1
//        5 4
//        1 2 3
//        3 4 4
//        1 4 1
//        2 2 2
//        예제 출력 1
//        1 2 1 1 0