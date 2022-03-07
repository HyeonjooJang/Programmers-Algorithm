package Baekjoon;
import java.io.*;

public class B_11282 { // 11282번. 한글

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    // 입력받은 값
    int N = Integer.parseInt(bf.readLine());
    N = N + 44031; // 가의 아스키코드
    char C = (char) N;
    System.out.println(C);
  }
}
