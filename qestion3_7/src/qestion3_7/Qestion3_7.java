package qestion3_7;
import java.util.Scanner;
public class Qestion3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数値:");
		int a=stdIn.nextInt();
		
		if (a<=0)
			System.out.println("正でない値が入力されました。");
		else if(a%3==0)
			System.out.println("その値は3で割り切れます。");
		else if (!(a%3==2))
				System.out.println("その値を3で割った余りは1です。");
		else
			System.out.println("その値を3で割った余りは2です。");
		
		}

}
