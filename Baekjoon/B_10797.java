package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10797 { //10797번. 10부제
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int D = Integer.parseInt(br.readLine()); //날짜
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0; //위반차량 확인
		
		for(int i = 0; i < 5; i++) {
			int car = Integer.parseInt(st.nextToken());
			if(car == D) {
				result++;
			}
		}
		System.out.println(result);
	}

}
