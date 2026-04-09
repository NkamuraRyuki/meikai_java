package ensyuu4_8;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_8
 * 概要    :整数値を読み込んで、その桁数を出力するプログラム
 * 作成者  :中村竜生
 * 作成日  :2026/04/09
 */
public class ensyuu4_8 {
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
		System.out.println("入力された数字の桁数を表示します。");

		//入力された数字を格納する変数
		int inputNumber = 0;

		//桁数を格納する変数
		int countUp = 0;

		//マイナス＆0対策
		do {
			//正の整数値の入力を促す
			System.out.println("正の整数値を入力してください。");

			//入力された数字を格納する
			inputNumber = standardInput.nextInt();

			//正の整数値が入力されるまで繰り返す
		}while (inputNumber <= 0);


		//桁数を数える
		while (inputNumber > 0) {

			//桁を1つ小さくする
			inputNumber /= 10;

			//1桁カウントする
			countUp ++;
		}
		//入力された数字の桁数を出力する
		System.out.print( countUp );
	}


}
