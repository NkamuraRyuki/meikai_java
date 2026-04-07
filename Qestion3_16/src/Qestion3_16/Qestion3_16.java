
package Qestion3_16;
import java.util.Scanner;
public class Qestion3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("変数a:");	int a=stdIn.nextInt();
		System.out.println("変数b:");	int b=stdIn.nextInt();
		System.out.println("変数c:");	int c=stdIn.nextInt();
		
		if (a>b&&a>c) 
			
			if (c>b) {
				int t=a;
				a=b;
				b=c;
				c=t;
				System.out.println("a<=b<=cとなるようにソートしました。");
				System.out.println("変数aは"+a+"です。\n変数bは"+b+"です。\n変数cは"+c+"です。");}
		
			else {
				int t=a;
				a=c;
				c=t;
				System.out.println("a<=b<=cとなるようにソートしました。");
				System.out.println("変数aは"+a+"です。\n変数bは"+b+"です。\n変数cは"+c+"です。");}
				
		else if (b>a&&b>c) 
			
			if (a>c) {
				int t=b;
				b=a;
				a=c;
				c=t;
				System.out.println("a<=b<=cとなるようにソートしました。");
				System.out.println("変数aは"+a+"です。\n変数bは"+b+"です。\n変数cは"+c+"です。");}
				
			else {
				int t=b;
				b=c;
				c=t;
				System.out.println("a<=b<=cとなるようにソートしました。");
				System.out.println("変数aは"+a+"です。\n変数bは"+b+"です。\n変数cは"+c+"です。");}
		
		else if (c>a&&c>b)
			
			if (a>b) {
				int t=a;
				a=b;
				b=t;
				System.out.println("a<=b<=cとなるようにソートしました。");
				System.out.println("変数aは"+a+"です。\n変数bは"+b+"です。\n変数cは"+c+"です。");}
		
			else {
				System.out.println("a<=b<=cとなるようにソートしました。");
				System.out.println("変数aは"+a+"です。\n変数bは"+b+"です。\n変数cは"+c+"です。");}
		
			}
		}
			
			
		
	
	

