package com.jc.mobileStore;

import java.sql.SQLException;
import java.util.Scanner;

import com.jc.jdbcpoc.CrudOperations;

public class VivoMobileStore {
	public static void main(String[] args) {
		System.out.println("Vivo Store Details");
		CrudOperations c = new CrudOperations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Selected Below options");
		System.out.println("1.Create Table");
		System.out.println("2.Insert Values");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			try {
				c.createTable("VivoMobileShop",
						new String[] { "MobileId", "MobileName", "MobileCount", "TypeOfMobile" });
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Please enter mobile id");
			int mobileId = sc.nextInt();
			System.out.println("Please enter mobile Name");
			String mobileName = sc.next();
			System.out.println("Please enter mobile count");
			int mobileCount = sc.nextInt();
			System.out.println("Please enter mobile Type");
			String mobileType = sc.next();
			try {
				int insertMobiles = c.insertMobiles("vivomobileshop",mobileId, mobileName, mobileCount, mobileType);
				if (insertMobiles == 0) {
					System.out.println("insertion Failed");
				} else {
					System.out.println("insertion success");
				}
			} catch (SQLException e) {
				e.getMessage();
			}
			break;
		default:
			break;
		}

	}

}
