package com.junior.curso_java_basico.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor 1 = 1 AND valor2 = 2 = RESULTADO = "+resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor 1 = 1 OU valor 2 = 2 = RESULTADO = "+resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro ^ verdadeiro );
		System.out.println(verdadeiro && verdadeiro );
		System.out.println(verdadeiro || verdadeiro );
		System.out.println(verdadeiro && false );

	}

}
