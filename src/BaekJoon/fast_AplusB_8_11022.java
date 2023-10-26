package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class fast_AplusB_8_11022 {
    public static void main(String[] args) throws IOException {
        //입력을 받기위해 BufferedReader선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력을 위해 BufferedWriter선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력할 더할 숫자 셋트 수 입력
        int inputSetCount = Integer.parseInt(br.readLine());
        // 문자를 입력받고 분리할  StringTokenizer선언
        StringTokenizer st;
        // 셋트 수만큼 반복
        for (int i=0;i<inputSetCount;i++){
            //빈칸을 기준으로 문자 배열 만들어 저장
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            // 값 문자로 입력후 저장
            bw.write("Case #"+(i+1)+": "+ x+" + "+y+" = "+(x+y)+"\n");
        }
        // 작성 버퍼 종료
        br.close();
        // 출력 버퍼에서 저장된 문자 풀력
        bw.flush();
        //출력 버퍼 종료
        bw.close();
        

    }
}
//        A+B - 8
//        시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
//        1 초	256 MB	180721	122605	108874	68.550%
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        출력
//        각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
//        예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        Case #1: 1 + 1 = 2
//        Case #2: 2 + 3 = 5
//        Case #3: 3 + 4 = 7
//        Case #4: 9 + 8 = 17
//        Case #5: 5 + 2 = 7