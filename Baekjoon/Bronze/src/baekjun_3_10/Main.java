package baekjun_3_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value < X)
				sb.append(value).append(' ');
		}

		System.out.println(sb);
	}
}
