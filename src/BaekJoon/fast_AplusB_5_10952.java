package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class fast_AplusB_5_10952 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if ((x == 0) && (y == 0)) {
                break;
            } else {
                bw.write(Integer.parseInt(String.valueOf(x + y)) + "\n");
            }
        }
        bw.flush();
        bw.close();

    }
}
//        A+B - 5
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//        입력
//        입력은 여러 개의 테스트 케이스로 이루어져 있다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        입력의 마지막에는 0 두 개가 들어온다.
//        출력
//        각 테스트 케이스마다 A+B를 출력한다.
//        예제 입력 1
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        0 0
//        예제 출력 1
//        2
//        5
//        7
//        17
//        7