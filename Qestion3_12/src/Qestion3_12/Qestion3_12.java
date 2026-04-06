package Qestion3_12;
import java.util.Scanner;
public class Qestion3_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数a:");	int a=stdIn.nextInt();
		System.out.println("整数b:");	int b=stdIn.nextInt();
		System.out.println("整数c:");	int c=stdIn.nextInt();
		
		int min=a;
		if (min>b) min=b;
		if (min>c) min=c;
		
		System.out.println("最小値は"+min+"です。");
		
	}

}
