package java430708;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		System.out.println("���������ѽ�");
		Scanner input =new Scanner(System.in);
		int money =input.nextInt();
		if(money>=50){
		System.out.println("�Ƿ�μ��Żݻ��\n");
		System.out.println("1.��50����2Ԫ�������¿�������һƿ");
		System.out.println("2.��100����3Ԫ����500ml��������һƿ");
		System.out.println("3.��100����10Ԫ����5kg���");
		System.out.println("4.��200����10Ԫ����1����������˹�");
		System.out.println("5.��200����20Ԫ����ŷ����ˬ��ˮ");
		System.out.println("0.������");
		System.out.println("��ѡ��");
		}
		int no =input.nextInt();
		switch(no){
		case 0:
		    System.out.println("���������ܽ�"+money+"\n"+"������");
		break;
		case 1:
			int spendmoney1 =money+2;
			System.out.println("���������ܽ�"+spendmoney1+"\n"+"�ɹ�����");
		break;
		case 2:
			if(money>=100){
			int spendmoney2 =money+3;
			System.out.println("���������ܽ�"+spendmoney2+"\n"+"�ɹ�����");
			}
			else{
				System.out.println("�����ϻ���");
			}
		break;
		case 3:
			if(money>=100){
			int spendmoney3 =money+10;
			System.out.println("���������ܽ�"+spendmoney3+"\n"+"�ɹ�����");
			}
			else{
				System.out.println("�����ϻ���");
			}
		break;
		case 4:
			if(money>=200){
			int spendmoney4 =money+10;
			System.out.println("���������ܽ�"+spendmoney4+"\n"+"�ɹ�����");
			}
			else{
				System.out.println("�����ϻ���");
			}
		break;
		case 5:
			if(money>=200){
			int spendmoney5 =money+20;
			System.out.println("���������ܽ�"+spendmoney5+"\n"+"�ɹ�����");
			}
			else{
				System.out.println("�����ϻ���");
			}
		break;
		}
		
}

}