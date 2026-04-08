package ensyuu4_4f;
/*
 * クラス名:ensyu4_3
 * 概要    :List4_4のwhile文終了時にxの値が-1になることを確認する
 * 作成者  :中村竜生
 * 作成日  :2026/04/08
 */
import java.util.Scanner;
public class ensyuu4_4 {

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
		
		//整数Aの入力を促す
		System.out.println("カウントダウンします。");
		
		//入力された数字
		int InputNumber=0 ;
		
		//正の数字が入力されるまで繰り返す
		do {
			//整数Aの入力を促す
			System.out.println("正の整数値：");
			//入力された文字を読み込む
			InputNumber = standardInput.nextInt();
		} 
		//正の整数が入浴されたらループを抜ける
		while (InputNumber<=0);
		
		//0までカウントダウンする
		while (InputNumber>=-1) {
			//出力する
			System.out.println(InputNumber);
			//入力された数字から1引く
			InputNumber --;
			
		}
	}

}
