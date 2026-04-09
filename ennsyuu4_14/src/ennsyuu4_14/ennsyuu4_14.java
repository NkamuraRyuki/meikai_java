package ennsyuu4_14;

//キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:ensyuu4_14
 * 概要    :List4_13を書き換えて図のような式を表示させる
 * 作成者  :中村竜生
 * 作成日  :2026/04/09
 */
public class ennsyuu4_14 {
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
		System.out.println("1から入力した数までの和を求めます。");

		//入力された数字を格納する
		int inputNumber = standardInput.nextInt();

		//和を格納する
		int sumNumber = 0; 

		//正の整数値以外を対策
		for(; inputNumber <= 0 ;inputNumber = standardInput.nextInt()){
			//正の整数値を入力させる
			System.out.println("正の整数値を入力してください。");
		}

		//1から入力された数字までの整数を全て足す
		for (int countUp = 1;countUp <= inputNumber;countUp ++) {

			//和を求める
			sumNumber += countUp;

			//countがinputNumberより小さければ末尾に"+"をつける
			if (countUp < inputNumber) {

				//"+"を付けて出力
				System.out.print(countUp+"+");
			}

			//countがinputNumberと等しければ末尾に"="をつける
			else {

				System.out.print(countUp+"=");
			}
		}

		//和を出力する
		System.out.println(sumNumber);

	}

}


