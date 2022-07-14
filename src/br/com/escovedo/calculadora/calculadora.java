package br.com.escovedo.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
   int a, b;
   System.out.println("Digite o primeiro Valor: ");
   a = scan.nextInt();
   System.out.println("Digite o segundo Valor: ");
   b = scan.nextInt();
   int soma = soma(a,b);
   int subtrai = subtrai(a,b);
  int multiplica = multiplica(a,b);
  double divisao = divisao(a,b);
  System.out.println(soma);
  System.out.println(subtrai);
  System.out.println(multiplica);
  System.out.println((double)divisao);
   
	}
	public static int soma(int a, int b) {
		return a + b;
	}
    public static int subtrai(int a, int b) {
    	return a - b;
    }
    public static int multiplica(int a, int b) {
    	return a * b;
    }
    public static double divisao(int a, int b) {
    	return (double)a / b;
    }

    
}
