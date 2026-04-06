package Qestion3_15;
import java.util.Scanner;
public class Qestion3_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("変数a:");	int a=stdIn.nextInt();
		System.out.println("変数b:");	int b=stdIn.nextInt();
		
		if (a<b) {
			int t=a;
			a=b;
			b=t;
		}
		System.out.println("a>=bとなるようにソートしました。");
		System.out.println("変数aは"+a+"です。");
		System.out.println("変数bは"+b+"です。");
	
	}

}
