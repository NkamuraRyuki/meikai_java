package Qestion3_8;
import java.util.Scanner;
public class Qestion3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
		
		System.out.println("点数を0～100で入力");
		int a=stdIn.nextInt();
		
	if (a>=0&&a<=100) {
		if (0<=a&&a<=59) 
			System.out.println("不可");
		else if (60<=a&&a<=69)
			System.out.println("可");
		else if (70<=a&&a<=79)
			System.out.println("良");
		else
			System.out.println("優");}
	else {
		System.out.println("点数を0～100で入力してください。");
	}
	
	}
		
	

}
