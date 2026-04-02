package Question2_6;

import java.util.Scanner;

public class Question2_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);

		 System.out.println("三角形の面積を求めます。");
		 System.out.println("底辺:");
		 double c=stdIn.nextDouble();
		 System.out.println("高さ:");
		 double d=stdIn.nextDouble();
		 System.out.println("面積は"+(c*d)/2+"です。");
	}

}
