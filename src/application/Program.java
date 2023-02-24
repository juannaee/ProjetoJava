package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String path = "C:\\Users\\Administrador\\Desktop\\Pasta para testes JAVA\\in3.txt";

		List<Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();

			}
			Collections.sort(list);
			Product x = CalculationService.max(list);
			System.out.println("Produto mais caro: ");
			System.out.println(x);
			System.out.println("--------------------------------------------");
			System.out.println(list);

		} catch (IOException e) {
			System.out.println("ERROR" + e.getMessage());
		}

	}

}
