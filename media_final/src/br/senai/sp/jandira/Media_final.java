package br.senai.sp.jandira;

import java.util.Scanner;

public class Media_final {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
                               
			System.out.println("Nome do aluno: ");
			String nome  = teclado.nextLine();
			System.out.println("Nota do bimestre 1: ");
			double nota1  = teclado.nextDouble();
			System.out.println("Nota do bimestre 2: ");
			double nota2= teclado.nextDouble();
			System.out.println("Nota do bimestre 3: ");
			double nota3  = teclado.nextDouble();
			System.out.println("Nota do bimestre 4: ");
			double nota4 = teclado.nextDouble();
			double soma = (nota1 + nota2 + nota3 + nota4);
			double media = (soma / 4);
			
			
			System.out.println("*************************************");
			System.out.println("             MÉDIA FINAL");
			System.out.println("*************************************");
			System.out.println("                                      ");	
			System.out.println("Nome do aluno: " + nome);
			
			System.out.println("Nota do bimestre 1: " + nota1);
			System.out.println("Nota do bimestre 2: " + nota2);
			System.out.println("Nota do bimestre 3: " + nota3);
			System.out.println("Nota do bimestre 4:" + nota4);
			
			
			System.out.println("                                     ");
			System.out.println("-------------------------------------");
			System.out.println(nome + ", a sua nota final é:  " + media);
			System.out.println("-------------------------------------");
			System.out.println("                                     ");
			 
			
			if (media < 6) {
				
				System.out.println("QUE PENA!! VOCÊ FOI REPROVADO");
			} else if (media >= 6) {
				System.out.println("PARABÉNS!! VOCÊ FOI APROVADO!!");
			}
				
			
			
			
			
			
			}
			
		
		
	}

