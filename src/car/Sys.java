package car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType = { "����", "����", "�µ�" };
		int[] busType = {10,32};
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("1��car or 2��bus");
		System.out.print("����Ҫ��������ų�:");
		int car=input.nextInt();
		System.out.print("����Ҫ��������ͳ�:");
		int bus = input.nextInt();
		int sel = 0;
		int day=0;
			double totalFee=0;
			for (int i = 0; i < car; i++) {
				System.out.println("type 1��bmw 2��audi 3��benc");
				sel = input.nextInt();
				System.out.println("day");
				 day = input.nextInt();
				Moto moto = new Car("³ B88888");
				((Car) moto).setType(carType[sel - 1]);
				 totalFee += moto.rentFee(day);
			 System.out.println("����"+carType[sel-1]+","+day+"�ܷ���"+moto.rentFee(day));
				 
				 // �������
				 // ������
	
			}
			 for (int j = 0; j < bus; j++) {
					 System.out.println("seatCount 1�� < 16 2�� > 16");
					 sel = input.nextInt();
						System.out.println("day");
						day = input.nextInt();

				 Moto moto1 = new Bus("³ A88888");
					 ((Bus) moto1).setSeatCount(busType[sel - 1]);
					 // �������
				 totalFee += moto1.rentFee(day);
					 // ������
					 System.out.println("**car , * day , totalfee ***" + moto1.rentFee(day));
					 
					
			 }
			 
			 System.out.println("�㹲����"+car +"�ų�"+bus+"�ͳ�"+"�ܷ���Ϊ"+totalFee);
			}
	
	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
