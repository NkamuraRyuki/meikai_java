package ensyu4_17;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_17
 * 概要    :List4_13を書き換えて、約数の表示後、その個数を表示する
 * 作成者  :中村竜生
 * 作成日  :2026/04/10
 */
public class ensyu4_17 {
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
		System.out.println("入力した値の約数と、その個数を表示します。\n整数値：");
		//入力された値を格納
		int inputNumber = standardInput.nextInt();
		
		//約数の個数を格納
		int sumNumber = 0;
		//iを入力された値まで1ずつカウントアップする
		for ( int i = 1 ; i <= inputNumber ; i ++ ) {
			//iが入力された値の約数の場合
			if (inputNumber % i == 0){
				//約数を出力する
				System.out.println(i);
				//
				sumNumber += 1;
			}
		}
		//約数の個数を出力
		System.out.println(inputNumber+"の約数の個数は"+sumNumber+"個です。");
		
	}

}
