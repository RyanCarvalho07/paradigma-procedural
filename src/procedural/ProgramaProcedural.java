package procedural;

import java.util.Scanner;

public class ProgramaProcedural {

    // Função que lê uma nota do usuário
    public static double lerNota(Scanner scanner, int numeroDaNota) {
        System.out.print("Digite a nota " + numeroDaNota + ": ");
        return scanner.nextDouble(); // Lê um número real do teclado
    }

    // Função que calcula a média entre duas notas
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2; // Soma e divide por 2
    }

    // Função que mostra o resultado com base na média
    public static void mostrarResultado(double media) {
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

    // Função principal (ponto de entrada do programa)
    public static void main(String[] args) {

        // Criando o scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Ler duas notas
        double nota1 = lerNota(scanner, 1);
        double nota2 = lerNota(scanner, 2);

        // Passo 2: Calcular a média
        double media = calcularMedia(nota1, nota2);

        // Passo 3: Mostrar o resultado
        mostrarResultado(media);

        // Fechar o scanner
        scanner.close();
    }
}

