package calccoinage;

import java.util.Scanner;

public class Calculation {
	
	//紙幣を追加----
	//１万円札
	int bill10000 = 0;
	//5千円札
	int bill5000 = 0;
	//千円札
	int bill1000 = 0;
	//---------------
	//500円玉の枚数
	int coin500 = 0;
	//100円玉の枚数
	int coin100 = 0;
	//10円玉の枚数
	int coin10 = 0;
	//5円玉の枚数
	int coin5 = 0;
	//1円玉の枚数
	int coin1 = 0;		
    //残金額
	int Rent_coin = 0;
	
	public void calcstart(){
		//金額の入力
		Scanner stdimoney = new Scanner(System.in);
		System.out.println("金額を入力してください");
		int money = stdimoney.nextInt();
		
		//紙幣を追加------------------------------
		bill10000 = money / 10000;
		Rent_coin = money % 10000;
		
		bill5000 = Rent_coin / 5000;
		Rent_coin = Rent_coin % 5000;
		
		bill1000 = Rent_coin / 1000;
		Rent_coin = Rent_coin % 1000;
		//------------------------------------------
		
		//500円玉硬貨
		coin500 = Rent_coin / 500;
		Rent_coin = Rent_coin % 500;
		
		//100円玉硬貨
		coin100 = Rent_coin / 100;
		Rent_coin = Rent_coin % 100;
		
		//10円玉硬貨
		coin10 = Rent_coin / 10;
		Rent_coin = Rent_coin % 10;
				
		//5円玉硬貨
		coin5 = Rent_coin / 5;
		Rent_coin = Rent_coin % 5;

		//1円玉硬貨
		coin1 = Rent_coin;
		
	
	
	}
}
