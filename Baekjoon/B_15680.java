package Baekjoon;
import java.io.*;

public class B_15680 { // 15680번. 스타후르츠
    private static BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        if (n == 0) {
            System.out.println("YONSEI");
        } else if (n == 1) {
            System.out.println("Leading the Way to the Future");
        }
    }
}
