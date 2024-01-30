package BaekJoon;

import java.util.Scanner;

public class StringRepetition_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt(); // 입력할 횟스
        int[] strRepeatNum = new int[inputNum]; //문자를 몇번 반복할지
        String[] str = new String[inputNum]; //문자입력

        scanner.nextLine();

        //입력할 횟수만큼 반복 , 입력
        for (int i = 0; i < inputNum; i++) {
            strRepeatNum[i] = scanner.nextInt(); //문자를 몇번 반복할지
            str[i] = scanner.next(); //문자입력
        }

        //입력할 횟수만큼 반복 , 출력
        for (int i = 0; i < inputNum; i++) {
            // 문자의 길이 만큼
            for (int j = 0; j < str[i].length(); j++) {
                // 반복 횟수만큼 반복 = 최종적으로 (문자길이)*(반복횟수)만큼의 반복이 적용됨
                for (int k = 0; k < strRepeatNum[i]; k++) {
                    System.out.print(str[i].charAt(j)); //각 문자위치에서 문자 반복횟수만큼 연속 출력
                }
            }
            System.out.println();
        }
    }
}


//        문자열 반복 다국어
//        시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//        1 초	128 MB	214823	108045	91788	50.136%
//        문제
//        문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
//
//        QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
//
//        출력
//        각 테스트 케이스에 대해 P를 출력한다.


//    예제 입력 1
//        2
//        3 ABC
//        5 /HTP
//        예제 출력 1
//        AAABBBCCC
///////HHHHHTTTTTPPPPP
