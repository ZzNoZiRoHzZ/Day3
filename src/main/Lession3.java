package main;

import java.util.Scanner;

public class Lession3 {
	public static void main(String[] args) {
		// Câu 1:Tìm số chẵn, số lẻ
		int myNum1 = 10;
		int scNum1 = 12;
		int scNum2 = 5;
		int scNum3 = 2;
		int tnCT = 59;
		
		int day = 24;
		int month = 3;
		int year = 1994;

		kiemTra(myNum1);

		soLonNhat(scNum1, scNum2, scNum3);

		soTrongKhoang(scNum3);

		baSoTaoDay(scNum1, scNum2, scNum3);

		tinhLuong(tnCT);
		
		giaiPhuongTrinh(scNum3, scNum2);
		
		ngayTrongThang(day, month, year);

	}

	public static void kiemTra(int a) {
		if (a % 2 == 0) {
			System.out.println("Day la so chan!");
		} else {
			System.out.println("Day la so le");
		}
	}

	public static void soLonNhat(int a, int b, int c) {
		// Câu 2: Tìm số lớn nhất trong 3 số
		int maX = a;

		if (maX < b) {
			maX = b;
		}
		if (maX < c) {
			maX = c;
		}
		System.out.println("So lon nhat:  " + maX);
	}

	public static void soTrongKhoang(int a) {
		// Câu 3: kiểm tra số khai báo có trong từ 10 - 100 ko

		if (10 <= a && a <= 100) {
			System.out.println("So nay nam trong khoang tu 10 den 100");
		} else {
			System.out.println("So nay khong nam trong khoang tu 10 den 100");
		}

	}

	public static void baSoTaoDay(int a, int b, int c) {
		// Câu 4: Kiểm tra 3 số có tạo thành dãy tăng dần hay ko?
		if (b < a && a < c) {
			System.out.println("Cac so nay tao thanh day so tang dan");
		} else {
			System.out.println("Cac so nay ko tao thanh day so tang dan");
		}
	}

	public static void tinhLuong(int a) {
		// Câu 5: Viết chương trình nhập vào thâm niên công tác (TNCT)

		int luOngCB = 650000;
		float hsL, luOng;

		if (a < 12) {
			hsL = 1.92f;
		} else if (a >= 12 && a < 36) {
			hsL = 2.34f;
		} else if (a >= 36 && a < 60) {
			hsL = 3f;
		} else {
			hsL = 4.5f;
		}
		luOng = hsL * luOngCB;

		System.out.println("TNCT: " + a);
		System.out.println("Luong Can Ban: " + luOngCB);
		System.out.println("He so: " + hsL);
		System.out.println("Luong: " + luOng);
	}

	public static void giaiPhuongTrinh(int a,int b) {
		// Câu 6: Viết chương trình giải phương trình bậc 1: ax + b = 0

		double ngX;
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			ngX = (double) -b / a;
			System.out.println("Phương trình có nghiệm x = " + ngX);
		}
	}
	
	public static void ngayTrongThang(int a,int b,int c) {
	// Câu 7: Viết chương trình nhập vào ngày và tháng, cho biết tháng đó có bao
	// nhiêu ngày



	switch(b)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Is month 31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Is month 30 days");
			break;
		case 2:	
			if (c % 4 == 0) {
				if (c % 100 == 0) {
					if (c % 400 == 0) {
						System.out.println("Is month 29 days.");
					} else {					
						System.out.println("Is month 28 days.");
					}
				} else {	
					System.out.println("Is month 29 days.");
				}
			} else {
				System.out.println("Is month 28 days.");
			}
		}
	}
	
}