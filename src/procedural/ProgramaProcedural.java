package procedural;

import java.util.Scanner;

public class ProgramaProcedural {

    
    public static double lerNota(Scanner scanner, int numeroDaNota) {
        System.out.print("Digite a nota " + numeroDaNota + ": ");
        return scanner.nextDouble(); // Lê um número real do teclado
    }

    
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2; // Soma e divide por 2
    }

    
    public static void mostrarResultado(double media) {
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

    
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        double nota1 = lerNota(scanner, 1);
        double nota2 = lerNota(scanner, 2);

        
        double media = calcularMedia(nota1, nota2);


        mostrarResultado(media);

        scanner.close();
    }
}

