package ensyuu4_20;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_20
 * 概要    :n段の正方形を表示するプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/10
 */
public class ensyuu4_20 {
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
		//実施する内容の表示と、入力を促す
		System.out.print("n段の正方形を表示します。\nn：");
		//入力された値を格納する変数
		int inputNumber = standardInput.nextInt();
		
		//正の整数値以外の値を除外
		for ( ; inputNumber <= 0;inputNumber = standardInput.nextInt()) {
			//正の整数の入力を促す
			System.out.print("nは正の整数\nn：");
		}
				
		//iを1からinputNumber＊inputNumberまでカウントする
		for( int i = 1 ; i <= (inputNumber * inputNumber) ; i ++ ) {
			//＊を改行しないで表示する
			System.out.print("*");
			
			//inputNumber個目で改行して表示する
			for ( ;i % inputNumber <= 0;) {
				//＊を表示する
				System.out.println();
				break;
			}
			
			
				
		}
		
	
	}

}
