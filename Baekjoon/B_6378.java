package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_6378 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /*
     * while(true) {
     * String s = br.readLine();
     * if(s.equals("0"))
     * break;
     * String[] st;
     * st = s.split("");
     * int[] N = new int[st.length];
     * for(int i = 0; i< N.length; i++) {
     * N[i] = Integer.parseInt(st[i]);
     * }
     * }
     */

    while (true) {
      String S = br.readLine();

      if (S.equals("0"))
        break;

      while (true) {
        // 자릿수의 수들을 합쳐서 저장할 변수
        int sum = 0;

        // 문자열 길이가 1이 되면 무한루프 종료
        if (S.length() < 2) {
          break;
        } else {
          for (int i = 0; i < S.length(); i++) {
            sum += S.charAt(i) - '0';
          }
        }
        // 합을 문자열에 형변환해서 저장
        S = String.valueOf(sum);
      }
      System.out.println(S);
    }
  }

}
