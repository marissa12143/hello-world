package edu.umsl.fooddiaryproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FoodDiary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Scanner scanInt = new Scanner(System.in);

		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter("fooddiaryrecord.csv", true));

			String date;
			String foodTime;
			String foodItem;
			int calories;
			int carbohydrates;
			int sugar;
			int fiber;
			int protein;

			while(true){
				while(true){
					System.out.print("Enter Date : ");
					date = sc.nextLine();
					try {
						new SimpleDateFormat("MM/dd/yyyy").parse(date);
						break;
					} catch (Exception e) {
						System.out.println("Please enter valid date format - MM/DD/YYYY");
					}
				}

				System.out.print("Enter Food Time : ");
				foodTime = sc.nextLine();
				System.out.print("Enter Food Item : ");
				foodItem = sc.nextLine();
				System.out.print("Enter Calories: ");
				calories = scanInt.nextInt();
				System.out.print("Enter Carbohydrates ");
				carbohydrates = scanInt.nextInt();
				System.out.print("Enter Sugar: ");
				sugar= scanInt.nextInt();
				System.out.print("Enter Fiber: ");
				fiber= scanInt.nextInt();
				System.out.print("Enter Protein: ");
				protein= scanInt.nextInt();

				out.write(date+","+ foodTime + "," + foodItem + "," + calories + ","+ carbohydrates + "," + sugar + "," + fiber + "," + protein + "\n");
				//still able to keep appending to file after saying "n" and running again
				System.out.print("Do you want to add more items : y/n > ");
				String choice = sc.nextLine();
				if(choice.toUpperCase().charAt(0)!='Y'){
					break;
				}
			}
			out.close();
		} catch (Exception e) {
			System.out.println("file not found");
		}
		sc.close();
		scanInt.close();
	}
}