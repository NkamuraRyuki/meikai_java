package Qestion3_11;
import java.util.Scanner;
public class Qestion3_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数A:");	int a=stdIn.nextInt();
		System.out.println("整数B:");	int b=stdIn.nextInt();
		
		int min=a>b?(a-b):(b-a);
		
		if (min<=10)
			System.out.println("それらの差は10以下です。");
		else
			System.out.println("それらの差は11以上です。");
				
		}
}
