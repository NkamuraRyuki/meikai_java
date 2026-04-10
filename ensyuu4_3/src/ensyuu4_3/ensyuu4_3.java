package ensyuu4_3;

/*
 * クラス名:ensyu4_3
 * 概要    :2つの整数値間の全整数を昇順で表示
 * 作成者  :中村竜生
 * 作成日  :2026/04/06
 */
import java.util.Scanner;
class ensyuu4_3 {

	/*
	 * 関数名           :main
	 * メソッドの説明   :main処理をするための関数
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者  			:中村竜生
	 * 作成日  			:2026.04.08.
	 */
	public static void main(String[] args) {
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);

		//整数Aの入力を促す
		System.out.println("整数A：");

		//読み込んだ整数で初期化
		int firstNumber = standardInput.nextInt();

		//整数Bの入力を促す
		System.out.println("整数B：");

		//読み込んだ整数で初期化
		int secondNumber = standardInput.nextInt();

		//小さい方の数字を判定
		int startMin = (firstNumber < secondNumber) ? firstNumber : secondNumber;

		//大きい方の数字を判定
		int endMax = (firstNumber > secondNumber) ? firstNumber : secondNumber;

		//小さい方の数字が大きい方の数字と等しくなるまで＋1を繰り返す
		do {
			//最小値を出力する
			System.out.println(startMin);

			//最小値に＋1する
			startMin=startMin+1;

			//大きいほうの数字と等しくなるまで続ける
		}while(startMin<=endMax);
	}
}