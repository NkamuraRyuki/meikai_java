package ensyuu4_12;

//キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:ensyuu4_12
 * 概要    :0から正の整数値までカウントアップするプログラム
 * 作成者  :中村竜生
 * 作成日  :2026/04/09
 */
public class ensyuu4_12 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :main処理をするための関数
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者  			:中村竜生
	 * 作成日  			:2026.04.09.
	 */
	public static void main(String[] args) {

		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);

		//実施される内容を表示する
		System.out.println("カウントアップします。");

		//入力された数字を格納する
		int inputNumber = standardInput.nextInt();

		//正の整数値以外を対策
		for(; inputNumber <= 0 ;inputNumber = standardInput.nextInt()) {
			//正の整数値を入力させる
			System.out.println("正の整数値を入力してください。");
		}

		//0から入力された数字まで1ずつ増やす
		for (int countUp = 0; countUp <= inputNumber ; countUp ++) {

			//出力する
			System.out.println(countUp);
		}


	}

}
