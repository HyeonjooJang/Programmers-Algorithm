package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1159 { // 농구경기
    static final int ASCII = 97;
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int n = Integer.valueOf(st.nextToken());
      int[] alphabet = new int[26];
      
      // 성씨 개수 파악 
      for(int i = 0; i < n; i++) {
        String name = br.readLine();
        char first = name.charAt(0);
        alphabet[first - ASCII]++;
      }
  
      StringBuilder sb = new StringBuilder();
      
      // 5개 이상 비교 
      for(int i = 0; i < alphabet.length; i++) {
        if(alphabet[i] >= 5) {
          sb.append((char) (i + ASCII));
        }
      }
      
      if(sb.length() == 0) {
        System.out.print("PREDAJA");
      }
      else {
        System.out.print(sb.toString());
      }
    }
  }
   
/*   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
		char[] name = new char[N];
    String temp = ""; // 결과값

		// 이름의 첫번째 글자를 담음.
		for(int i = 0; i < N; i++) {
			name[i] = (br.readLine()).charAt(0);
		}

    // 비교할 대상 시작.
		for(int i = 0; i < N - 1; i++) {
      for(int j = i + 1; j < N; j++) {
        if(name[i] == name[j] ) {
          int cnt = 0;''
					cnt++;
          
				}
			}
		}
		if(temp.equals("")) {
			System.out.println("PREDAJA");
		}else {
			System.out.println(temp);
		}
	}
*/
  