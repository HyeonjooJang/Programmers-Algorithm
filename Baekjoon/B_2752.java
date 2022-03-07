package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* StringTokenizer 클래스는 객체에서 더 이상 가져올 토큰이 없다면 
java.util.NoSuchElementException 예외를 발생시킵니다. */

public class B_2752 { // 2752번. 세수정렬
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] iArr = new int[3];
      for (int i = 0; i < iArr.length; i++) {
        iArr[i] = Integer.parseInt(st.nextToken());
      }
      /*
       * 주의할 점은 byte, char, double, short, long, int, float같은
       * PrimitiveType의 배열에는 적용이 불가능하니
       * Integer같은 Wrapper "Class"를 이용해야 한다
       */
      Arrays.sort(iArr);

      for (int i : iArr) {
        System.out.print(i + " ");
      }
    }
  }
}
