package main;

import java.util.Scanner;

public class Lession3 {
	public static void main(String[] args) {
		// Câu 1:Tìm số chẵn, số lẻ
		int myNum1 = 10;

		if (myNum1 % 2 == 0) {
			System.out.println("Day la so chan!");
		} else {
			System.out.println("Day la so le");
		}

		// Câu 2: Tìm số lớn nhất trong 3 số

		int scNum1 = 12;
		int scNum2 = 5;
		int scNum3 = 2;

		int maX = scNum1;

		if (maX < scNum2) {
			maX = scNum2;
		}
		if (maX < scNum3) {
			maX = scNum3;
		}
		System.out.println("So lon nhat:  " + maX);

		// Câu 3: kiểm tra số khai báo có trong từ 10 - 100 ko

		int scNum4 = 20;

		if (10 <= scNum4 && scNum4 <= 100) {
			System.out.println("So nay nam trong khoang tu 10 den 100");
		} else {
			System.out.println("So nay khong nam trong khoang tu 10 den 100");
		}

		if (10 <= scNum2 && scNum2 <= 100) {
			System.out.println("So nay nam trong khoang tu 10 den 100");
		} else {
			System.out.println("So nay khong nam trong khoang tu 10 den 100");
		}

		// Câu 4: Kiểm tra 3 số có tạo thành dãy tăng dần hay ko?

		if (scNum2 < scNum1 && scNum1 < scNum4) {
			System.out.println("Cac so nay tao thanh day so tang dan");
		} else {
			System.out.println("Cac so nay ko tao thanh day so tang dan");
		}

		// Câu 5: Viết chương trình nhập vào thâm niên công tác (TNCT)

		int tnCT = 59;
		int luOngCB = 650000;
		float hsL, luOng;

		if (tnCT < 12) {
			hsL = 1.92f;
		} else if (tnCT >= 12 && tnCT < 36) {
			hsL = 2.34f;
		} else if (tnCT >= 36 && tnCT < 60) {
			hsL = 3f;
		} else {
			hsL = 4.5f;
		}
		luOng = hsL * luOngCB;

		System.out.println("TNCT: " + tnCT);
		System.out.println("Luong Can Ban: " + luOngCB);
		System.out.println("He so: " + hsL);
		System.out.println("Luong: " + luOng);

		// Câu 6: Viết chương trình giải phương trình bậc 1: ax + b = 0

		int a = 3;
		int b = 3;
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
		
		// Câu 7: Viết chương trình nhập vào ngày và tháng, cho biết tháng đó có bao nhiêu ngày
		
		int day = 24;
		int month = 3;
		int year = 1994;
		
		switch (month) {
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
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
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