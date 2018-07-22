package cmo.sportcode.pl;

import java.util.Scanner;

public class Classmethodobject //Deklaracja klasy
{
	public static void main(String[] args) //Deklaracja podstawowej metody
	{
		int number , number2 , suma , mnozenie ;
		Scanner odczyt = new Scanner(System.in) ; //Obiekt 
		System.out.println("Podaj pierwsza liczbe");
		number = odczyt.nextInt() ; 
		System.out.println("Podaj druga liczbe");
		number2 = odczyt.nextInt() ;  
	       
	}

	public int suma(int number , int number2) //Druga metoda w naszym programie
	{
		return number + number2 ; 
	}
	
	public int mnozenie(int number , int number2)//Trzecia metoda w naszym programie
	{
		return number * number2 ; 
	}
}
