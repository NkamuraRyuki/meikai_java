package ensyuu4_2;

/*
 * クラス名:ensyu4_2
 * 概要    :2桁の整数値での数当てゲーム
 * 作成者  :中村竜生
 * 作成日  :2026/04/06
 */
import java.util.Random;
import java.util.Scanner;

public class ensyuu4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//乱数を生成する
Random standardRandom=new Random();
//キーボードからの入力を読み込む
Scanner standardInput=new Scanner(System.in);


//10~99の数字をランダムに生成
int randomNumber=standardRandom.nextInt(90)+10;
//ゲーム開始を知らせる
System.out.println("数当てゲーム開始！");
//ルールの説明
System.out.println("10~99の数を当ててください。");
//プレイヤーが入力した数字
int guessNumber=0;

//正解するまで行う
do {
	//数字の入力を促す
	System.out.println("いくつかな？");
	//入力した数字を変数に代入
	guessNumber=standardInput.nextInt();
	
	//乱数生成した数値と読み込んだ数値が等しいかどうか
	//読み込んだ値が生成した値より小さい場合
	if(guessNumber<randomNumber) {
		//より大きい値だと出力
		System.out.println("もっと大きな数だよ。");
	}//読み込んだ値が生成した値より大きい場合//
	else if(guessNumber>randomNumber) {
		//より小さい値だと出力
		System.out.println("もっと小さな数だよ。");
	}
//生成した値と入力した値が一致するまでループ
}while(guessNumber!=randomNumber);

//2つの値が一致したことを出力
System.out.println("正解です。");

	}

}