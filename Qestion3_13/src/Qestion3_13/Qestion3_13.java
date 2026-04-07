package Qestion3_13;
import java.util.Scanner;
public class Qestion3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		


		System.out.println("整数a:");	
		int a=stdIn.nextInt();
		
		System.out.println("整数b:");
		int b=stdIn.nextInt();
		
		System.out.println("整数c:");
		int c=stdIn.nextInt();
		
		
		
		if (a<=b&&a<=c) {
			if (b<=c) 
				System.out.println("中央値は"+b+"です。");
			else if(b>c) 
				System.out.println("中央値は"+c+"です。");}
		else if (b<=a&&b<=c) {
			if(a<=c)
				System.out.println("中央値は"+a+"です。");
			else
				System.out.println("中央値は"+c+"です。");}
	
		else if (c<=a&&c<=b) {
				if(a<=b)
					System.out.println("中央値は"+a+"です。");
				else
					System.out.println("中央値は"+b+"です。");}
		
		
		
			
		
		
	
	}	
	
	}

