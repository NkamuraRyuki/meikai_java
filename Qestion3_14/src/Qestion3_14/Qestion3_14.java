package Qestion3_14;
import java.util.Scanner;
public class Qestion3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
	System.out.println("変数a:");	int a=stdIn.nextInt();
	System.out.println("変数b:");	int b=stdIn.nextInt();
		
	
	int min,max;
	
	if (a==b)
		System.out.println("2つの値は同じです。");
	else if (a<b) {
		min=a;
		max=b;
		System.out.println("小さい方の値は"+min+"です。");
		System.out.println("大きい方の値は"+max+"です。");
	}
	else {
		min=b;
		max=a;
		System.out.println("小さい方の値は"+min+"です。");
		System.out.println("大きい方の値は"+max+"です。");}
		
		
	
	

}
}