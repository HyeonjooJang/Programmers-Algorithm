package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_7568 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] weight = new int[N]; // 몸무게
    int[] tall = new int[N]; // 키

    // 배열에 키몸무게 입력
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      weight[i] = Integer.parseInt(st.nextToken());
      tall[i] = Integer.parseInt(st.nextToken());
    }

    // 자기 자신을 제외한 모든 경우의 수를 처음부터 끝까지 비교
    for (int i = 0; i < N; i++) {
      int grade = 1; // 덩치의 등수를 정함. 가장 큰 덩치가 1.
      for (int j = 0; j < N; j++) {
        if (weight[j] > weight[i] && tall[j] > tall[i]) {
          grade += 1;
        }
      }
      bw.write(grade + " ");
    }
    bw.flush();
  }

}
