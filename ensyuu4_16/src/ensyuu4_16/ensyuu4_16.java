package ensyuu4_16;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_16
 * 概要    :List4_11を5個表示する毎に改行するプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/10
 */
public class ensyuu4_16 {
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
		System.out.println("*を表示します。何個*を表示しますか：");
		
		int inputNumber = standardInput.nextInt();
		
		//正の整数で入力させる
		for ( ; inputNumber <= 0 ; inputNumber = standardInput.nextInt()) {
			//
			System.out.println("正の整数で入力してください。");
		}
		
		
		//
		for (int i = 1 ; i <= inputNumber; i ++) {
			
			if ((i % 5 == 0)) {
				//*を出力する
				System.out.println("*");
			}
			else {
				//*を出力する
				System.out.print("*");
			}
		}

	}

}
