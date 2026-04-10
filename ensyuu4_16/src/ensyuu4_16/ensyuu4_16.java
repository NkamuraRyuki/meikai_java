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
		//入力された値を格納する
		int inputNumber = standardInput.nextInt();

		//正の整数以外を除外
		for ( ; inputNumber <= 0 ; inputNumber = standardInput.nextInt()) {
			//正の整数で入力させる
			System.out.println("正の整数で入力してください。");
		}


		//入力された値までiをカウントアップする
		for (int i = 1 ; i <= inputNumber; i ++) {
			//iが5で割り切れる値の場合
			if ((i % 5 == 0)) {
				//*を改行して出力する
				System.out.println("*");
				
				//iが5で割り切れない場合
			}else {
				//*を改行せずに出力する
				System.out.print("*");
			}
		}

	}

}
