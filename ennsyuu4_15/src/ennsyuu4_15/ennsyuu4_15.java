package ennsyuu4_15;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_15
 * 概要    :身長と標準体重の対応表を表示するプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/09
 */
public class ennsyuu4_15 {
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
		//実施される内容の表示と、開始値/終了値/増分の入力を促す
		System.out.println("身長と標準体重の対応表を表示します。\n何cmから：\n何cmまで：\n何cmごと：");
		//開始値を格納する
		int startHeight = standardInput.nextInt();
		//終了値を格納する
		int endHeight = standardInput.nextInt();
		//増分を格納する
		int increaseHeight = standardInput.nextInt();
		//正の整数値以外を対策
		for(; startHeight <= 0 || endHeight <= 0 || increaseHeight <= 0;increaseHeight = standardInput.nextInt()){
			//正の整数での入力を促す
			System.out.println("全て正の整数で入力\n何cmから：\n何cmまで：\n何cmごと：");
			//再度入力させる
			startHeight = standardInput.nextInt();
			//再度入力させる
			endHeight = standardInput.nextInt();
		}
		//出力する
		System.out.println("身長"+" "+"標準体重");
		//身長を開始値から終了値まで増分ごとに増やす
		for (int countUp =0,sumHeight = startHeight+countUp ; startHeight+countUp <= endHeight ; countUp += increaseHeight) {
			//身長と標準体重を出力
			System.out.println((startHeight+countUp)+" "+((sumHeight-100)*0.9));
		}
	}
}