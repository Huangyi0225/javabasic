package java430708;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		System.out.println("请输入消费金额：");
		Scanner input =new Scanner(System.in);
		int money =input.nextInt();
		if(money>=50){
		System.out.println("是否参加优惠活动：\n");
		System.out.println("1.满50，加2元换购百事可乐饮料一瓶");
		System.out.println("2.满100，加3元换购500ml可乐饮料一瓶");
		System.out.println("3.满100，加10元换购5kg面粉");
		System.out.println("4.满200，加10元换购1个苏珀尔炒菜锅");
		System.out.println("5.满200，加20元换购欧莱雅爽肤水");
		System.out.println("0.不换购");
		System.out.println("请选择：");
		}
		int no =input.nextInt();
		switch(no){
		case 0:
		    System.out.println("本次消费总金额："+money+"\n"+"不换购");
		break;
		case 1:
			int spendmoney1 =money+2;
			System.out.println("本次消费总金额："+spendmoney1+"\n"+"成功换购");
		break;
		case 2:
			if(money>=100){
			int spendmoney2 =money+3;
			System.out.println("本次消费总金额："+spendmoney2+"\n"+"成功换购");
			}
			else{
				System.out.println("不符合换购");
			}
		break;
		case 3:
			if(money>=100){
			int spendmoney3 =money+10;
			System.out.println("本次消费总金额："+spendmoney3+"\n"+"成功换购");
			}
			else{
				System.out.println("不符合换购");
			}
		break;
		case 4:
			if(money>=200){
			int spendmoney4 =money+10;
			System.out.println("本次消费总金额："+spendmoney4+"\n"+"成功换购");
			}
			else{
				System.out.println("不符合换购");
			}
		break;
		case 5:
			if(money>=200){
			int spendmoney5 =money+20;
			System.out.println("本次消费总金额："+spendmoney5+"\n"+"成功换购");
			}
			else{
				System.out.println("不符合换购");
			}
		break;
		}
		
}

}