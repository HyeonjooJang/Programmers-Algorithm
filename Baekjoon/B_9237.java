package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_9237 {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 묘목의 수
    Integer trees[] = new Integer[N]; // 정렬의 위한 배열생성
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      trees[i] = Integer.parseInt(st.nextToken());
    }
    // sort메서드의 첫번째 인자가 T[]가 필요로 한다. Integer배열을 생성해야함.
    // int로 할 시 컴파일에러가 뜬다.
    // 내림차순 정렬
    Arrays.sort(trees, Collections.reverseOrder());

    // 나무가 자라는 걸린 일 수 + 심는데 걸린 일 수
    int max = 0;
    for (int i = 0; i < N; i++) {
      trees[i] = trees[i] + i + 1;
      if (trees[i] > max) {
        max = trees[i];
      }
    }
    //묘목을 구입한 날은 1일이다.
    System.out.println(max + 1);
  }
}