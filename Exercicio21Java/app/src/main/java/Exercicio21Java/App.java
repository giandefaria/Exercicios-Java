/*
Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package Exercicio21Java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        String nome;
        char sexo;
        int idade;
        char saude;
        char desejaContinuar = 'S';
        int quantidadeInscritos = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Informe o seu nome: ");
            nome = leitor.next();
            
            System.out.println("Informe o sexo. M - mulher, H - homem");
            sexo = leitor.next().charAt(0);
            
            System.out.println("Informe a idade:");
            idade = leitor.nextInt();
            
            System.out.println("Informe seu estado de saude. B - boa, R - ruim");
            saude = leitor.next().charAt(0);
            
            if ( (sexo == 'h' || sexo == 'H') && idade >= 18 && (saude == 'B' || saude == 'b') ) {
            
                System.out.println(nome + ", sexo " + sexo + ", saude boa, "
                        + "está apto para cumprir o serviço militar obrigatório");
            } else {
            
                System.out.println(nome + ", sexo " + sexo + ", saude " + 
                        ", não está apto para cumprir o serviço militar obrigatório");
            }
            
            quantidadeInscritos++;
            
            System.out.println("Deseja continuar? S - sim, N - não");
            desejaContinuar = leitor.next().charAt(0);
        }
        
        System.out.println("Quantidade de inscritos: " + quantidadeInscritos);
        
    }
}
