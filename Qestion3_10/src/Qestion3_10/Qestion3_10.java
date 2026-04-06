package Qestion3_10;
import java.util.Scanner;
public class Qestion3_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数a:");	int a=stdIn.nextInt();
		System.out.println("整数b:");	int b=stdIn.nextInt();
		
		int min=a>b?(a-b):(b-a);
		System.out.println("2つの整数の差は"+min+"です。");
		
	
		
	}

}
