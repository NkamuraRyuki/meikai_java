package ensyuu4_18;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_18
 * 概要    :1からnまでの整数値の2乗値を表示するプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/10
 */
public class ensyuu4_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :main処理をするための関数
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者  			:中村竜生
	 * 作成日  			:2026.04.10.
	 */
	public static void main(String[] args) {

		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//実施される内容の表示と、入力を促す
		System.out.print("入力した値の約数と、その個数を表示します。\n整数値：");
		//入力された値を格納
		int inputNumber = standardInput.nextInt();

		//正の整数以外が入力されたとき
		for ( ; inputNumber < 1 ; inputNumber = standardInput.nextInt()) {
			//正の整数値を入力させる
			System.out.print("正の整数値を入力してください。:");
		}

		//iを入力された正の整数までカウントアップする
		for (int i = 1 , quaredNumber = 1; i <= inputNumber ; i ++ ) {
			//
			quaredNumber = (i * i);
			//
			System.out.println(i + "の2乗は" + quaredNumber);

		}





	}

}
