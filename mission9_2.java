package chap02;

import java.util.Scanner;
//��Ʈ��+����Ʈ+O �ؼ� ����Ʈ �ҷ����� 

public class mission9_2 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// ���� ������
	//Scanner scan;				// Constructor(������)-�޼ҵ�,������ ����, �����ڸ�==Ŭ������, scan- ��ü��
	//new Scanner(System.in);	// �ϳ��� �޼ҵ�(������ �޼ҵ�), new- ��������, Scanner- �����ڸ�, (System.in)- ǥ���Է½�Ʈ��(�Է¹���)
	 							// new�� �־ �����Ҵ�(����)����
	
	//369������ ������ �ۼ��غ���.1~99������ ������ �Է¹ް� ������ 3,6,9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ���, �ΰ��� �ִ� ���� "�ڼ�¦¦"�� ���	
	//��) �Էµ� ���� 13�� ��� "�ڼ�¦", 36�� ��� "�ڼ�¦¦"  ���
	
	System.out.print("(369����) 1~99������ ������ �Է��ϼ���. : ");
	var a = scan.nextInt();

	//int grade = 0;		// String ���ڿ�		int ������
	
	// �б��� if��
	if( a > 100) {
		if()
			System.out.println("�ﰢ���� �����մϴ�.");
	}
	
	else
		System.out.println("(369����) 1~99������ ������ �Է��ϼ���.");
	
	
	scan.close();

	}
	
}