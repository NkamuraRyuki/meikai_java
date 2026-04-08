package Question3_2;
import java.util.Scanner;
public class Question3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("整数A:");
		int a=stdIn.nextInt();
		System.out.println("整数B:");
		int b=stdIn.nextInt();
		
		if (b!=0) {
			if (a%b==0) {
				System.out.println("BはAの約数です。");
			}
			else {
				System.out.println("BはAの約数ではありません。");
			}
		}else {
			System.out.println("BはAの約数ではありません。");
		}
	}

}


