package day_of_ayear;

import java.util.Scanner;

public class DayOfAYear {

	public static void main(String[] args) {
		int[] date = getDate();
		while (date[1] > 12 || date[1] < 1) {
			System.out.println("月份输入非法！");
			date = getDate();
		}
		if (date[0] % 4 == 0 && date[0] % 100 != 0 || date[0] % 400 == 0) {
			switch (date[1]) {
			case 12:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 11:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 10:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 9:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 8:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 7:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 6:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 5:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 4:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 3:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 2:

			{
				while (date[2] > 29 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 1:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			}

		} else {

			switch (date[1]) {
			case 12:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 11:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 10:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 9:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 8:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 7:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 6:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 5:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 4:

			{
				while (date[2] > 30 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			case 3:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 2:

			{
				while (date[2] > 29 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;
			case 1:

			{
				while (date[2] > 31 || date[1] < 1) {
					System.out.println("天数输入非法！");
					date = getDate();
				}
			}
				break;

			}
		}
		calculate(date);

	}

	public static int[] getDate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入日期：(例：2018 06 23)");

		int[] date = new int[3];
		for (int i = 0; i < 3; i++) {
			date[i] = scan.nextInt();
		}
		return date;
	}

	public static void calculate(int[] date) {
		int totalDay = 0;

		switch (date[1] - 1) {
		case 11:

			totalDay += 30;

		case 10:

			totalDay += 31;

		case 9:

			totalDay += 30;

		case 8:

			totalDay += 31;

		case 7:

			totalDay += 31;

		case 6:

			totalDay += 30;

		case 5:

			totalDay += 31;

		case 4:

			totalDay += 30;

		case 3:

			totalDay += 31;

		case 2:
			if (date[0] % 4 == 0 && date[0] % 100 != 0 || date[0] % 400 == 0)

				totalDay += 29;
			else
				totalDay += 28;

		case 1:

			totalDay += 31;

		default:

			totalDay += date[2];
			;

		}

		System.out.println("" + date[0] + "年" + date[1] + "月" + date[2] + "日是这一年的第" + totalDay + "天。");
	}
}
