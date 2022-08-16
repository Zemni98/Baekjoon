package baekjun_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}

	}

}
