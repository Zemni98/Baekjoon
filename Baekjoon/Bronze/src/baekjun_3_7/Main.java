package baekjun_3_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			int A = Integer.parseInt(str.substring(0, target));
			int B = Integer.parseInt(str.substring(target + 1));
			int result = A + B;
			sb.append("Case #" + i + ": " + A + " + " + B + " = " + result + "\n");
		}

		br.close();
		System.out.println(sb);
	}
}