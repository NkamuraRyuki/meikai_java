package Question2_8;
import java.util.Random;
import java.util.Scanner;

public class Question2_8a {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数値は:");
		int x=stdIn.nextInt();
		
		Random rand=new Random();
		int lucky=rand.nextInt(11);
		int y=x+lucky-5;
		System.out.println("その値の±5の乱数を生成しました。"+"それは"+y+"です。");
		
	}

}
