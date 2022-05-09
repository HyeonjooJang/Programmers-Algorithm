package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1225 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String a = st.nextToken();
    String b = st.nextToken();

    String aa[] = a.split("");
    String bb[] = b.split("");
    int n = aa.length;
    int m = bb.length;
    long sumA = 0, sumB = 0;
    for (int i = 0; i < n; i++) {
      sumA += Integer.parseInt(aa[i]);
    }
    for (int i = 0; i < m; i++) {
      sumB += Integer.parseInt(bb[i]);
    }

    long res = sumA * sumB;
    System.out.println(res);
  }
}
/*
1x4 + 1x5 + 2x4 + 2x5 + 3x4 + 3x5

->1(4+5)+2(4+5)+3(4+5)

->(1+2+3)(4+5)
*/
//https://2youngjae.tistory.com/9