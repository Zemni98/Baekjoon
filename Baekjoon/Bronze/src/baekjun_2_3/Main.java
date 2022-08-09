package baekjun_2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String str = br.readLine();
	int A = Integer.parseInt(str);
	if(A%4==0 && A%100 != 0) System.out.println("1");
	else if(A%400 ==0)System.out.println("1");
	else System.out.println("0");;
	
}}