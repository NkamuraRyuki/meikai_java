package Qestion3_9;
import java.util.Scanner;
public class Qestion3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("実数a:");
		double a=stdIn.nextInt();
		System.out.println("実数b:");
		double b=stdIn.nextInt();
		
		double bignumber=a>b?a:b;
		
		if (a!=b) {
			System.out.println("大きいほうの値は"+bignumber+"です。");
		}
		else {
			System.out.println("同じ数字です。");}
			
			
		
	}
	}