package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B_1010 {
	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int arr[][] = new int[30][30];//0<N<=M<30 이므로
		int N = 0;
		int M = 0;
		
		for(int i=0; i<30; i++) {
			//사이트 수가 같을때는 어떻게 하든 방법이 1가지
			arr[i][i] = 1;
			//왼쪽 사이트가 1개이고, 오른쪽 사이트가 하나씩 늘어날때는 가짓수가 하나씩 늘어남.
			arr[0][i] = i+1;
		}
		for(int i=1; i<30; i++) {
			for(int j=i+1; j<30; j++) {
        // 2A 이라면 1A + 1B 의 합이 2A가 된다
				arr[i][j] = arr[i][j-1] + arr[i-1][j-1];
			}
		}
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			//arr[0][0]이 N=1 M=1를 의미 하므로 -1을 하여 출력한다.
			System.out.println(arr[N-1][M-1]);
		}
		bw.flush();
		bw.close();
	}
}