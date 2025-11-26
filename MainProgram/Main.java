package MainProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.Product;
import Exceptions.QuantityExceptions;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		List<Product> productsList = new ArrayList<>();
		String path = "Deskot\\Java\\CashierSystem\\src\products.txt";
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			String line;
			
			while ((line = bf.readLine()) != null) {
				
				String[] array = line.split(";");
				
				Product p = new Product(array[0], Integer.parseInt(array[1]), Double.parseDouble(array[2]));
				
				for (product p: )
				
			}
		}
		catch(IOException e) {
			System.out.println("Error> " + e.getMessage());
		}
		finally {
			sc.close();
			
		}
		
	}

}
