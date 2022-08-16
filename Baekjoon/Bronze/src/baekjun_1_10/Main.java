package baekjun_1_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		int[] piece = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < piece.length; i++) {
			int n = Integer.parseInt(st.nextToken());
			sb.append(piece[i] - n + " ");
		}
		System.out.println(sb);

	}

}
