package org.estrutura;

import org.estrutura.model.Obj;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        for (int i = 0; i < 10; i++) {            //lógica para criar árvore binária com 10 números aleatórios
            int numeroTemp = random.nextInt(90);
            minhaArvore.inserir(new Obj(numeroTemp));
        }
        System.out.println("Seja Bem Vindo \n Números Criados para Estrutura em Árvore");
        System.out.println("------------------------");
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        System.out.println("\nAgora vamos manipular os dados.\n");

        int num = 0;
        while (num != 4) {

            System.out.println("Digite 1 - Exibição de Dados \n" +
                    "Digite 2 - Inserir Dados \nDigite 3 - Remover Dados" +
                    "Digite 4 - sair");
            num = scan.nextInt();
            if (num == 1) {
                System.out.println("Digite 1 - exibir dados InOrdem\nDigite 2 - exibir dados PreOrdem" +
                        "\nDigite 3 - exibir dados PosOrdem");
                int numTemp = scan.nextInt();
                if (numTemp == 1) {
                    minhaArvore.exibirInOrdem();
                }
                if (numTemp == 2) {
                    minhaArvore.exibirPreOrdem();
                }
                if (numTemp == 1) {
                    minhaArvore.exibirPosOrdem();
                } else {
                    System.out.println("Número inválido!");
                }
            }
            if (num == 2) {
                System.out.print("Digite o número inteiro a ser inserido: ");
                int numTemp = scan.nextInt();
                minhaArvore.inserir(new Obj(numTemp));
                System.out.println("Veja o número inserido em ordem numérica.");
                minhaArvore.exibirInOrdem();
            }
            if (num == 3) {
                int numTemp = scan.nextInt();
                minhaArvore.remover(new Obj(numTemp));
                System.out.println("Procure o número retirado em ordem numérica.");
                minhaArvore.exibirInOrdem();
            }else{
                System.out.println("Número de operação inválido!");
            }
        }

        System.out.println(" Estudo de Estrutuda de dados em árvore - dev Juarez Martins \nObrigado!");
    }
}