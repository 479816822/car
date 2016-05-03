package car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = {10,32};
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("day");
		int day = input.nextInt();
		System.out.println("1、car or 2、bus");
		int sel = input.nextInt();
		if (sel == 1) {
			System.out.println("type 1、bmw 2、audi 3、benc");
			sel = input.nextInt();
			Moto moto = new Car("鲁 B88888");
			//moto.setType(carType[sel - 1]);
			// 计算租金
			double totalFee = moto.rentFee(day);
			// 输出结果
			System.out.println("**car , * day , totalfee ***" + totalFee);
		} else {
			System.out.println("seatCount 1、 < 16 2、 > 16");
			sel = input.nextInt();
			Moto moto = new Bus("鲁 A88888");
			//moto.setSeatCount(busType[sel - 1]);
			// 计算租金
			double totalFee = moto.rentFee(day);
			// 输出结果
			System.out.println("**car , * day , totalfee ***" + totalFee);
		}
	}
	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
