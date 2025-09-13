package controller;

import java.util.Scanner;

public class Validacao {

    public String validacaoString(String nomeCampo, String variavel, int caracter, Scanner scanner){
        if (variavel.isEmpty() || variavel.length() > caracter){
            while (variavel.isEmpty() || variavel.length() > caracter){
                System.out.println("Seu " + nomeCampo + " pode estar vazio ou ter ultrapassado o limite de caracter( " + caracter + " )");
                System.out.print("Por favor, digitar novamente: ");
                variavel = scanner.nextLine();
            }
        }
        return variavel;
    }
}
