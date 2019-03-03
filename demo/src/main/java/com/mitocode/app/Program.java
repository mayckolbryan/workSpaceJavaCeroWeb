package com.mitocode.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mitocode.entities.Account;
import com.mitocode.entities.Company;
import com.mitocode.entities.Individual;
import com.mitocode.entities.TaxPayer;
import com.mitocode.util.CurrencyConverter;

public class Program {

	static final double PI = 3.14;	//Singleton
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<TaxPayer> taxs = new ArrayList<TaxPayer>();
		System.out.println("Enter the number of tax.");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("TaxPayer #" + i +" data");
			System.out.println("Individual / Company (i/c)");
			char type = scanner.next().charAt(0);
			
			System.out.println("Name: ");
			scanner.nextLine();
			
			String name = scanner.nextLine();
			System.out.println("Anual: ");
			double anual = scanner.nextDouble();
			
			if (type == 'i') {
				System.out.println("Health: ");
				double health = scanner.nextDouble();
				taxs.add(new Individual(name, anual, health));
			}else {
				System.out.println("Number of Employees: ");
				int numberOfEmployees = scanner.nextInt();
				taxs.add(new Company(name, anual, numberOfEmployees));
			}
			
			double sum = 0.0;
			System.out.println("TAXES");
			for (TaxPayer taxPayer : taxs) {
//				if (taxPayer instanceof Individual) {
				double tp = taxPayer.tax();	//Polimorfismo
				System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", tp));
				sum+=tp;
			}
			
			System.out.println();
			System.out.println("Total Taxes:" + String.format("%.2f", sum));
		}
		
		/*Account account1, account2;
		
		account1 = new Account(123, "Gustavo");
		System.out.println("Balance Account1: " + account1.getBalance());
		account2 = new Account(1234, "Henry", 500.00);
		System.out.println("Balance Account2: " + account2.getBalance());
		
		reportView();
		
		double result = CurrencyConverter.dollarToPen(300.00, 3.45);
		System.out.println("Result: " + result);*/
	}

	public static void reportView() {
		System.out.println("Report");
	}
}
