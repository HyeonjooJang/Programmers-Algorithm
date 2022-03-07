package Baekjoon;
import java.io.*;

public class B_10162 { //전자레인지

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 입력받은 값
		int time = Integer.parseInt(bf.readLine());
		int A = 0, B = 0, C = 0; // 전자레인지 버튼의 초

		if (time % 10 != 0) {
			System.out.println(-1);
		} else {
			A = time / 300;
			time = time % 300;
			B = time / 60;
			time = time % 60;
			C = time / 10;
			System.out.printf("%d %d %d", A, B, C);
		}

	}

}
