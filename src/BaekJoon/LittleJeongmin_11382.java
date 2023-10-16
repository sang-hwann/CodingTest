package BaekJoon;
//        문제
//        꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//        입력
//        첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//        출력
//        A+B+C의 값을 출력한다.
import java.util.Scanner;
public class LittleJeongmin_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력기능
        try {
            String x = sc.nextLine(); //문자열로 입력후 문자변수로 저장
            String[] a = x.split(" "); //" " 띄어쓰기 공백으로 배열로 구성
            Long sum = 0L; // 총합을 구할 변수 생성 및 초기값지정
            if (a.length == 3) {
                for (String s : a) {
                    sum += Long.parseLong(s); //문자를 Long으로 만들어서 합침
                }
                System.out.println(sum); //총합 출력
            } else {
                System.out.println("숫자입력이 올바르지않습니다."); //배열 크기가 3개 이상이면 예외처리
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자입력이 올바르지않습니다."); //숫자 이외의 문자입력시 예외처리
        }
    }
}
//주의 총합의 크기제한이 int를 넘어서 Long을 이용해야됨 참고하기
