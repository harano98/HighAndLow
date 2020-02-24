package jp.co.fl.superintro.ch08;

import java.util.Scanner;

public class HighAndLowS01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		System.out.println("**************");
		System.out.println("* High & Low *");
		System.out.println("**************");

		while(true){
			int LeftCard = (int)(Math.random()*9)+1;
			int RightCard = (int)(Math.random()*9)+1;
			String select;
			String result;

			System.out.println();
			System.out.println("  <Question>  ");
			System.out.println("*****    *****");
			System.out.println("*   *    * * *");
			System.out.println("* "+LeftCard+" *    * * *");
			System.out.println("*   *    * * *");
			System.out.println("*****    *****");


			System.out.println(" High or low ?(h/l) >");
			select = sc.nextLine();

			if(select.equals("h")){
				System.out.println("  -> Selected High");
			}else{
				System.out.println("  -> Selected Low");
			}

			System.out.println();
			System.out.println("   <Answer>   ");
			System.out.println("*****    *****");
			System.out.println("*   *    *   *");
			System.out.println("* "+LeftCard+" *    * "+RightCard+" *");
			System.out.println("*   *    *   *");
			System.out.println("*****    *****");


			if(LeftCard<RightCard){
				result = "h";
			}else if(LeftCard>RightCard){
				result = "l";
			}else{
				result = select;
			}

			if(result.equals(select)){
				System.out.println("  -> You Win!");
			}else{
				System.out.println("  -> You Lose...");
				break;
			}
		}
		System.out.println();
		System.out.println("--Game Over--");
	}
}
