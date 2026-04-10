package ensyuu4_19;
//キーボードから入力した値を読み込むようにする
import java.util.Scanner;
/*
 * クラス名:ensyuu4_19
 * 概要    :
 * 作成者  :中村竜生
 * 作成日  :2026/04/10
 */
public class ensyuu4_19 {
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
		//入力された値を格納する変数
		int inputNumber = 0;
		//季節をもう一度求める場合に入力するを格納する変数
		int retry = 0;

		do {
			//実施される内容の表示と、入力を促す
			System.out.print("季節を求めます。\n何月ですか：");
			
			//1~12の値を入力させる
			do {
				//
				System.out.println("1～12で入力してください。");
				//入力された値を格納
				inputNumber = standardInput.nextInt();
				//1~12以外の値が入力された場合
			}while(inputNumber < 1 || inputNumber > 12);

			//3~5月の場合
			if (inputNumber >= 3 && inputNumber <= 5) {
				//春と表示
				System.out.println("それは春です。");
			}
			//6~8月の場合
			else if (inputNumber >= 6 && inputNumber <= 8){
				//夏と表示
				System.out.println("それは夏です。");
			}
			//9~11月の場合
			else if (inputNumber >= 9 && inputNumber <= 11){
				//秋と表示
				System.out.println("それは秋です。");
			}
			//12~2月の場合
			else {
				//冬と表示
				System.out.println("それは冬です。");
			}
		
		//
		System.out.print("もう一度? 1…Yes/0…No :");
		//
		retry = standardInput.nextInt();
		}while(retry == 1);
	}

}
