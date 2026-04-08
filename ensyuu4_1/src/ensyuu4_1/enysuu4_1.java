package ensyuu4_1;

//キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:ensyu4_1
 * 概要    :do文を用いてList3_5のプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/06
 */



public class enysuu4_1 {
	
/*
 * 関数名           :main
 * メソッドの説明   :main
 * パラメータの説明 :なし
 * 返り値           :なし
 * 作成者  :中村竜生
 * 作成日  :2026.04.08.
 */

	public static void main(String[] args) {
		
		//キーボードからの入力を読み込む
Scanner standerdInput=new Scanner(System.in);
//繰り返し入力するかどうか
int oneMore=0;

//繰り返し入力・表示できるようにする
do{
	
//整数値を打ち込ませる
System.out.println("整数値：");

//変数に整数値を読み込ませる
int judgementSigh=standerdInput.nextInt();


//読み込んだ整数値によって画面に出力する内容を変えさせる

//０より大きい場合
if (judgementSigh>0) {
	//読み込んだ値が０より大きければ出力する
	System.out.println("その値は正です。");
}

//０より小さい場合
else if (judgementSigh<0){
	
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
oneMore=standerdInput.nextInt();

//もう一度入力。表示させる
}while (oneMore==1);

	
}
}
