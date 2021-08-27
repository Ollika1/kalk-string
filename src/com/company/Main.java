package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;
public class Main {
	public Main(){

}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		int znak = -1;

		try {
			if (str.contains("+")) {

				znak = str.indexOf("+");

				SeparateString separateString = new SeparateString();
				String[] arr = separateString.separation(str,znak);
				if (!arr[0].isEmpty()){

				Addiction result = new Addiction();
				result.addict(arr[0], arr[1]);
				}

			} else if (str.contains("-")) {
				znak = str.indexOf("-");
				SeparateString separateString = new SeparateString();
				String[] arr = separateString.separation(str,znak);
					if (!arr[0].isEmpty()) {

					Subtraction result = new Subtraction();
					result.subtract(arr[0], arr[1]);
					}

			} else if (str.contains("/")) {
				znak = str.indexOf("/");
				SeparateStringTwo separateStringTwo = new SeparateStringTwo();
				String[] arr = separateStringTwo.separationTwo(str,znak);

				if (!arr[0].isEmpty()) {

					Division result = new Division();
					result.division(arr[0], arr[1]);
				}

			} else if (str.contains("*")) {
					znak = str.indexOf("*");
				SeparateStringTwo separateStringTwo = new SeparateStringTwo();
				String[] arr = separateStringTwo.separationTwo(str,znak);
				if (!arr[0].isEmpty()) {

					Multiplication result = new Multiplication();
					result.multi(arr[0], arr[1]);}
			}
				else throw new Exception("Отсутствует знак.") ;

		}	 catch (Exception var111){
				System.out.println("Некорректный ввод. "+ var111.getMessage());
			}
		}


	}




