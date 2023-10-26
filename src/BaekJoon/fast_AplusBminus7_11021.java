package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class fast_AplusBminus7_11021 {
    public static void main(String[] args) throws IOException {
        //문자입력을 위한 buffer 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자출력을 위한 buffer 객체 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //계산할 2개 정수의 셋트 갯수 입력
        int numSetCount = Integer.parseInt(br.readLine());
        // 문자를 잠시 입력받을 변수 ,StringTokenizer를 이용해서 긴 문자를 split처럼 분리가능
        StringTokenizer st ; 
        //입력할 셋트 갯수만틈 반복
        for (int i=0; i<numSetCount;i++){
            //문자를 입력, " " 빈칸마다 배열로 분리
            st = new StringTokenizer(br.readLine()," ");
            //분리된 문자를 입력
            bw.write("Case #"+(i+1)+": "+
                    (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        br.close(); //작성용 버퍼 종료
        //출력용 버퍼 출력
        bw.flush();
        bw.close();//출력용 버퍼 종료
    }
}

//        A+B-7
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        출력
//        각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
//        테스트 케이스 번호는 1부터 시작한다.
//        예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        Case #1: 2
//        Case #2: 5
//        Case #3: 7
//        Case #4: 17
//        Case #5: 7