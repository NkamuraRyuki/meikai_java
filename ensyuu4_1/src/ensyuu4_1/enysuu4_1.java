package ensyuu4_1;

/*
 * クラス名:ensyu4_1
 * 概要    :do文を用いてList3_5のプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/06
 */
import java.util.Scanner;

public class enysuu4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner standerdInput=new Scanner(System.in);
//あらかじめ宣言
int retry;
//繰り返し入力・表示できるようにする
do{
//整数値を打ち込ませる
System.out.println("整数値：");
//変数に整数値を読み込ませる
int judgementsigh=standerdInput.nextInt();

//読み込んだ整数値によって画面に出力する内容を変えさせる
//０より大きい場合
if (judgementsigh>0) {
	//読み込んだ値が０より大きければ出力する
	System.out.println("その値は正です。");
}
//０より小さい場合
else if (judgementsigh<0){
	//読み込んだ値が０より小さければ出力する
	System.out.println("その値は負です。");
}
//０の場合
else {
	//読み込んだ値が０ならば出力する
	System.out.println("その値は0です。");
}
//繰り返し入力するか促す
System.out.print("もう一度行いますか？\n1...Yes/2...No:");
//変数に読み込んだ値を代入
retry=standerdInput.nextInt();
}
//もう一度入力。表示させる
while (retry==1);
	
}
}
