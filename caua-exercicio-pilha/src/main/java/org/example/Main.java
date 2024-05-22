package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Repositorio repositorio = new Repositorio();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("1- Adicionar eletronico");
            System.out.println("2- Deletar eletronico do sistema");
            System.out.println("3- Exibir eletronicos");
            System.out.println("4- Desfazer alteração");
            System.out.println("5- Desligar");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do eletronico:");
                String nome = scanner.next();
                scanner.nextLine();

                System.out.println("Digite o valor do eletronico em 'R$ 00,00':");
                Double valor = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Digite a descrição técnica do produto:");
                String descricaoComponentes = scanner.nextLine();

                System.out.println("Digite se o eletronico é original (true ou false):");
                Boolean original = scanner.nextBoolean();
                scanner.nextLine();

                Eletronico eletronico = new Eletronico(nome, valor, descricaoComponentes, original);
                repositorio.salvar(eletronico);

            } else if (opcao == 2) {
                System.out.println("Digite o ID do eletronico a ser deletado");
                int id = scanner.nextInt();
                repositorio.deletar(id);

            } else if (opcao == 3) {
                repositorio.exibir();

            } else if (opcao == 4) {
                repositorio.desfazer();

            } else if (opcao == 5) {
                break;

            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}