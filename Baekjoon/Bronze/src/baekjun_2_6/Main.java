package baekjun_2_6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine();
	
	StringTokenizer st = new StringTokenizer(str," ");
	
	int A = Integer.parseInt(st.nextToken());
	int B = Integer.parseInt(st.nextToken());
	int C = Integer.parseInt(br.readLine());
	
	int min = (A * 60) +B;
	min += C;
	
	int hour = (min/60) % 24;
	int minute = min % 60;
	
	System.out.println(hour + " " + minute);
}}