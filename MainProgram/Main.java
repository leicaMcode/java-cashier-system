package MainProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Product;
import Exceptions.OutOfRange;

public class Main {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<>();
		boolean valid = false;
		String path = "c:\\temp\\products.txt";

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

			String line;

			while ((line = bf.readLine()) != null) {

				String[] array = line.split(";");

				Product p = new Product(array[0], Integer.parseInt(array[1]), Double.parseDouble(array[2]));

				productsList.add(p);

			}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		welcome();
		while (!valid) {
			try {
				options();
			} catch (OutOfRange e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

	public static void welcome() {
		System.out.println("-----------------------");
		System.out.println("Welcome to Sales Java");
		System.out.println("Please, choice an option: ");
		System.out.println();
	}

	public static void options() throws OutOfRange {

		Scanner sc = new Scanner(System.in);

		int choice = 0;

		while (choice < 1 || choice > 6) {

			System.out.println("-----------------------");
			System.out.println("[1] Add a new Product");
			System.out.println("[2] Add to Stock");
			System.out.println("[3] Remove to Stock");
			System.out.println("[4] See the Stock");
			System.out.println("[5] Sale");
			System.out.println("[6] Exit");
			System.out.println("-----------------------");
			System.out.print("--> ");
			choice = sc.nextInt();

			if (choice < 1 || choice > 6) {
				throw new OutOfRange("Invalid !! Please choice an option between 1 and 6 !");
			}
		}
		sc.close();
	}

}
