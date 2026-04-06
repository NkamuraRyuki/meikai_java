package Question2_9;
import java.util.Random;
public class Question2_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand=new Random();
		double lucky=rand.nextDouble();
		System.out.println("今日のラッキーナンバーは"+lucky+"です。");


		Random randa=new Random();
		double a=rand.nextDouble(11);
		System.out.println("今日のラッキーナンバーは"+a+"です。");
		
		
		Random randb=new Random();
		double b=rand.nextDouble(2)-1;
		System.out.println("今日のラッキーナンバーは"+b+"です。");
		
	
				
	}

}
