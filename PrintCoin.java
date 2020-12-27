package calccoinage;

public class PrintCoin {
	
	Calculation calculation = new Calculation();
	
	public void Print(){
		calculation.calcstart();
		System.out.println("硬貨の枚数は");
		System.out.println("500円玉：" + calculation.coin500);
		System.out.println("100円玉：" + calculation.coin100);
		System.out.println("10円玉：" + calculation.coin10);
		System.out.println("5円玉：" + calculation.coin5);
		System.out.println("1円玉：" + calculation.coin1);
	}

}
