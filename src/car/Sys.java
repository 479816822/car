package car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = {10,32};
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("1、car or 2、bus");
		System.out.print("你需要租多少俩桥车:");
		int car=input.nextInt();
		System.out.print("你需要租多少量客车:");
		int bus = input.nextInt();
		int sel = 0;
		int day=0;
			double totalFee=0;
			for (int i = 0; i < car; i++) {
				System.out.println("type 1、bmw 2、audi 3、benc");
				sel = input.nextInt();
				System.out.println("day");
				 day = input.nextInt();
				Moto moto = new Car("鲁 B88888");
				((Car) moto).setType(carType[sel - 1]);
				 totalFee += moto.rentFee(day);
			 System.out.println("你租"+carType[sel-1]+","+day+"总费用"+moto.rentFee(day));
				 
				 // 计算租金
				 // 输出结果
	
			}
			 for (int j = 0; j < bus; j++) {
					 System.out.println("seatCount 1、 < 16 2、 > 16");
					 sel = input.nextInt();
						System.out.println("day");
						day = input.nextInt();

				 Moto moto1 = new Bus("鲁 A88888");
					 ((Bus) moto1).setSeatCount(busType[sel - 1]);
					 // 计算租金
				 totalFee += moto1.rentFee(day);
					 // 输出结果
					 System.out.println("**car , * day , totalfee ***" + moto1.rentFee(day));
					 
					
			 }
			 
			 System.out.println("你共租了"+car +"桥车"+bus+"客车"+"总费用为"+totalFee);
			}
	
	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
