package ru.specialist.operators;

public class App {
	
	public static void main(String[] args) {
		int n = -10;
		
		if (n > 0) {
			System.out.println("n > 0");
			System.out.println("n ������ 0");
		}
		else { 
			if (n > -100)
				System.out.println("n > -100");
			else
				System.out.println("n �� ������ 0");
		}
		
		int a = 0;
//		String s;
//		if (a == 0)
//			s = "����";
//		else
//			s = "�� ����";
		
		String s = (a == 0) ? "����" : "�� ����";
		String name = "Sergey";
		
//		if (name != null)
//			System.out.println( name.toUpperCase() );
//		else
//			System.out.println( "<no name>" );
		
		System.out.println( (name != null) ? name.toUpperCase() : "<no name>" ); // SERGEY	
		System.out.println( name ); // Sergey
		
		int x = -1;
		
//		switch (x) {
//			case -1, 1 :
//				System.out.println("����");
//				break;
//			case 2 :
//				System.out.println("���");
//				break;
//			case 3 :
//				System.out.println("���");
//				break;
//			default:
//				System.out.println("�����");
//		}
		
		
		// switch express (since Java 12)
		String r = switch (x) {
			case -1, 1 -> "����";
			case 2 -> "���";
			case 3 -> "���";
			default -> "�����";
		};
		
		System.out.println(r);
		
		// ������� ����� �� ����� (0..9)?
		// �� ����� 5 �����
		
		
		
		

	}

}
