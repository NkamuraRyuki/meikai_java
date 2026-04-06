package Qestion3_4;
import java.util.Scanner;
public class Qestion3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数a:");
		int a=stdIn.nextInt();
		System.out.println("整数b:");
		int b=stdIn.nextInt();
	if (a>b)
		System.out.println("aのほうが大きいです。");
	else if (a<b)
		System.out.println("bの方が大きいです。");
		else 
			System.out.println("aとbは同じ値です。");
	
	}
}
