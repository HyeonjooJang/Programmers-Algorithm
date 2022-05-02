package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1333 { // 부재중 전화
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); //총 노래의 곡
    int L = Integer.parseInt(st.nextToken()); //노래의 길이
    int D = Integer.parseInt(st.nextToken()); //전화벨은 D초에 1번씩 1초동안 울림.

    boolean time[]=new boolean[N*L+5*(N-1)];
		for(int i=0;i<N;i++) {
			int s=(L+5)*i;
			for(int j=s;j<s+L;j++) {
				time[j]=true;
			}
		}
		int answer=0;
		while(answer<time.length) {
			if(!time[answer]) break;
			answer+=D;
		}
		System.out.println(answer);
	




  }
}
