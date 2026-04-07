package ensyuu4_3;

/*
 * クラス名:ensyu4_3
 * 概要    :2つの整数値間の全整数を昇順で表示
 * 作成者  :中村竜生
 * 作成日  :2026/04/06
 */
import java.util.Scanner; class ensyuu4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//キーボードからの入力を読み込む
Scanner standardInput=new Scanner(System.in);

//整数Aの入力を促す
System.out.println("整数A：");
//読み込んだ整数で初期化
int firstnumber=standardInput.nextInt();

//整数Bの入力を促す
System.out.println("整数B：");
//読み込んだ整数で初期化
int secondnumber=standardInput.nextInt();

//小さい方の数字を判定
int startmin=(firstnumber<secondnumber)?firstnumber:secondnumber;
//大きい方の数字を判定
int endmax=(firstnumber>secondnumber)?firstnumber:secondnumber;
//小さい方の数字が大きい方の数字と等しくなるまで＋1を繰り返す
do {
	//最小値を出力する
	System.out.println(startmin);
		//最小値に＋1する
        startmin=startmin+1;
    } 
//大きいほうの数字と等しくなるまで続ける
while(startmin<=endmax);

}
}