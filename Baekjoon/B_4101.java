package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4101 { //크냐?
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N1 = Integer.parseInt(st.nextToken());
      int N2 = Integer.parseInt(st.nextToken());

      if (N1 == 0 && N2 == 0) {
        break;
      }

      System.out.println(N1 > N2 ? "Yes" : "No");
    }

  }

}
