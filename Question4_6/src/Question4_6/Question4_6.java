package Question4_6;

//キーボードから入力した値を読み込むようにする
import java.util.Scanner;

/*
 * クラス名:Question4_6
 * 概要    :読み込んだ値が1未満であれば改行緒文字を出力しないようにList4_7及び4_8を書き換えたプログラムを作成
 * 作成者  :中村竜生
 * 作成日  :2026/04/08
 */

public class Question4_6 {

	/*
     * 関数名           :main
     * メソッドの説明   :main処理をするための関数
     * パラメータの説明 :なし
     * 返り値           :なし
     * 作成者  			:中村竜生
     * 作成日  			:2026.04.08.
     */
	
	public static void main(String[] args) {
		
		/*List4_7の書き換え*/
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//このプリグラムが何をするのか提示する
		System.out.println("何個*を表示しますか：");
		//入力された数字を読み込む
		int inputNumber = standardInput.nextInt();
		
		//while文で使う変数を初期化
		int countUp = 0;
		
		//入力された数だけ*を表示する
		while(countUp < inputNumber) {
			//'*'を出力
			System.out.println('*');
			//入力した数字に1足す
			countUp ++;
		}
		//1未満であれば改行文字を出力しないようにして、入力された数だけ*を表示する
		while(countUp > inputNumber) {
			//'*'を出力
			System.out.print('*');
			//入力した数字に1足す
			countUp --;
		}
		
		
		/*List4_8の書き換え*/
		//キーボードからの入力を読み込む
		Scanner standardInput = new Scanner(System.in);
		//このプリグラムが何をするのか提示する
		System.out.println("何個*を表示しますか：");
		//入力された数字を読み込む
		int inputNumber = standardInput.nextInt();
		
		//while文で使う変数を初期化
		int countUp = 1;
		
		//入力された数だけ*を表示する
		while(countUp <= inputNumber) {
			//'*'を出力
			System.out.println('*');
			//入力した数字に1足す
			countUp ++;
		}
		//1未満であれば改行文字を出力しないようにして、入力された数だけ*を表示する
		while(countUp-1 > inputNumber) {
			//'*'を出力
			System.out.print('*');
			//入力した数字に1引く
			countUp --;
		}
		
		
	}

}
