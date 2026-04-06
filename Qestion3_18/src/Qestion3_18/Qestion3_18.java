package Qestion3_18;
import java.util.Scanner;
public class Qestion3_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn =new Scanner(System.in);
System.out.println("何月？数字のみ入力：");
int month=stdIn.nextInt();

switch (month) {
case 3:
case 4:
case 5:System.out.println("季節は春です。"); break;
case 6:
case 7:
case 8:System.out.println("季節は夏です。"); break;
case 9:
case 10:
case 11:System.out.println("季節は秋です。"); break;
case 12:
case 1:
case 2:System.out.println("季節は冬です。"); break;

}
	}

}
