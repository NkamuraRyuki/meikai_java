package ensyuu4_7;

//キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:ensyuu4_7
 * 概要    :読み込んだ値の数だけ＊と＋を交互に表示させる
 * 作成者  :中村竜生
 * 作成日  :2026/04/08
 */

public class ensyuu4_7 {

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

		//入力を促す
		System.out.println("入力した数だけ＊と＋を交互に表示させます。");

		//入力された数字
		int inputNumber = 0;

		//入力された数字が正の整数であるようにする
		do {
			//入力された数字を読み込む
			inputNumber = standardInput.nextInt();
			//入力された数字が正の整数以外の場合に絞る
			if (inputNumber <= 0) {
				//正の整数での入力を促す
				System.out.println("正の整数で入力してください。");
			}
			//正の整数が入力されるまで繰り返す
		}while (inputNumber <= 0);

		//while文で使う変数を初期化
		int countUp = 0;

		//入力された数だけ*と+を交互に表示する
		while(countUp < inputNumber) {
			//偶数に絞る
			if (countUp%2==0) {
				//'*'を出力
				System.out.println('*');
				//countUpに1足す
				countUp ++;
			}
			//奇数に絞る
			else if (countUp%2==1) {
				//'+'を出力
				System.out.println('+');
				//countUpに1足す
				countUp ++;
			}	
		}	
	}
}
