package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B_2442 { //별 찍기 -5
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= n; i++) { //i=0 로 정하면 별찍기에서 음수가 나온다.
			
			for (int b = 0; b < n - i; b++) {
				System.out.print(" "); //공백
			}
			
			for (int s = 0; s < i * 2 - 1; s++) {
				System.out.print("*"); //별찍기 2n-1
			}
			
			System.out.println(); //줄바꿈
		}
	}
}
