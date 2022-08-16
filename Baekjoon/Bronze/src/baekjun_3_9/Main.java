package baekjun_3_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			for (int k = 1; k <= N - i; k++) {
				sb.append(" ");
			}

			for (int j = 1; j <= i; j++) {

				sb.append("*");
			}
			sb.append('\n');
		}

		System.out.print(sb);
	}
}