package Qestion3_9;
import java.util.Scanner;
public class Qestion3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("実数a:");	double a=stdIn.nextInt();
		System.out.println("実数b:");	double b=stdIn.nextInt();
		
		double min=a>b?a:b;
		
		System.out.println("大きいほうの値は"+min+"です。");
		
	}
	}