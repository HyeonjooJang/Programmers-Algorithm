package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2576 { // 2576번. 홀수

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0; // 합을 구할 변수.
    int min = 100; // 고른 홀수들 중 최솟값.
    int result = 0; // 짝수 확인 변수.

    int[] arr = new int[7];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) { // 짝수가 아니라면
        if (arr[i] < min) {
          min = arr[i];
        }
        sum += arr[i];
      } else { // 배열이 짝수로만 이루어져있는지 확인.
        result++;
      }
    }

    if (result == arr.length) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(min);
    }

  }
}
