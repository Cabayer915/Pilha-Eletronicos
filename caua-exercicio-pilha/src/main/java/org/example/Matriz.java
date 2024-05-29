package org.example;

public class Matriz {
    public static void main(String[] args) {
        String[] nomes = {"Smartphone", "Notebook", "Tablet", "Smartwatch", "Camera", "TV"};
        double[][] matriz = {
                {1500.0, 1800.0},
                {2200.0, 2500.0},
                {1000.0, 1200.0},
                {800.0, 850.0},
                {500.0, 700.0},
                {3000.0, 3200.0}
        };

        double[] somaColunas = new double[2];
        double[] somaLinhas = new double[nomes.length];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }

        System.out.printf("%-12s %-12s %-12s %n", "Eletrônico", "Ano Passado", "Este Ano");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%-12s %-12.2f %-12.2f %n", nomes[i], matriz[i][0], matriz[i][1]);
        }

        System.out.printf("%-12s %-12.2f %-12.2f %n", "Total", somaColunas[0], somaColunas[1]);

        System.out.println("\nSoma por linha:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%-12s %-12.2f %n", nomes[i], somaLinhas[i]);
        }
    }
}