package ensyuu4_10;

//キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:ensyuu4_10
 * 概要    :読み込んだ値が1未満であれば改行文字を出力しないようにList4_11をかきかえたプログラム
 * 作成者  :中村竜生
 * 作成日  :2026/04/09
 */
public class ensyuu4_10 {
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
		System.out.println("何個*を表示しますか。");

		//入力された数字を格納する
		int inputNumber = standardInput.nextInt();

		//1以上の場合
		if (inputNumber > 0) {

			//*を1つずつ、入力された数だけ表示する
			for (int countUp=0 ; countUp < inputNumber ; countUp ++) {
				//改行しつつ*を出力
				System.out.println("*");
			}
		}

		//1未満の場合
		else

			//*を1つずつ、入力された数だけ表示する
			for (int countUp = 0 ; countUp > inputNumber ;countUp --) {

				//改行せずに出力
				System.out.print("*");
			}
	}

	
}
