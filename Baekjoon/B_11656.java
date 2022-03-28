package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_11656 { // 접미사 배열
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 문자열 S
    String S = br.readLine();

    // 자른 문자열을 넣을 리스트 자료구조 선언
    List<String> list = new ArrayList<>();

    // 입력받은 단어의 길이만큼 반복문을 수행
    for (int i = 0; i < S.length(); i++) {
      // substring메소드를 사용하여 인덱스를 기준으로 뒤에 있는 문자를 리스트에 추가
      list.add(S.substring(i));
    }

    // 정렬메서드를 사용하여 알파벳순으로 정렬
    Collections.sort(list);

    // 결과 값 출력
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    /*
     * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     * 
     * String S = br.readLine();
     * 
     * String[] arr = new String[S.length()];
     * for (int i = 0; i < S.length(); i++) {
     * //substring() 배열에 문자열을 하나하나 잘라서 리턴한다.
     * arr[i] = (S.substring(i, S.length()));
     * }
     * //사전순으로 정렬.
     * Arrays.sort(arr);
     * 
     * for (int i = 1; i < arr.length; i++) {
     * System.out.println(arr[i]);
     * }
     */

  }
}
