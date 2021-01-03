package calccoinage;

public class PrintCoin {
	
	Calculation calculation = new Calculation();
	
	public void Print(){
		calculation.calcstart();
		//紙幣の追加------------------------------
		System.out.println("紙幣の枚数は");
		System.out.println("1万円札：" + calculation.bill10000 + "枚");
		System.out.println("5千円札：" + calculation.bill5000 + "枚");
		System.out.println("千円札：" + calculation.bill1000 + "枚");
		//------------------------------------------
		
		System.out.println("硬貨の枚数は");
		System.out.println("500円玉：" + calculation.coin500 + "枚");
		System.out.println("100円玉：" + calculation.coin100 + "枚");
		System.out.println("10円玉：" + calculation.coin10 + "枚");
		System.out.println("5円玉：" + calculation.coin5 + "枚");
		System.out.println("1円玉：" + calculation.coin1 + "枚");
	}

}
