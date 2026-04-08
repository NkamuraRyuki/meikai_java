package ensyuu4_5;

////キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:ensyu4_3
 * 概要    :List4_5のx--が--xの場合、どのようになるか確認する
 * 作成者  :中村竜生
 * 作成日  :2026/04/08
 */
public class ensyuu4_5 {

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
		Scanner standardInput=new Scanner(System.in);
		//このプリグラムが何をするのか提示する
		System.out.println("カウントダウンします。");
		//入力された数字
		int InputNumber =0;
		//正の整数値が入力されるまで繰り返す
		do {
			//正の整数値の入力を促す
			System.out.println("正の整数値：");
			//入力された数字を代入
			InputNumber = standardInput.nextInt();
			
		//正の整数値が入力されたらdo文から脱け出す
		}while (InputNumber <= 0);
		
		while (InputNumber >= 0){
			System.out.println(--InputNumber);
		}
	}

}
