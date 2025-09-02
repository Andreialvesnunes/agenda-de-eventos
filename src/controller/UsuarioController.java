package controller;

import model.Usuario;

import java.util.Map;
import java.util.Scanner;

public class UsuarioController {
    private Usuario usuario = new Usuario();
    protected Map<Enum, String> listaDeEventoConfirmados;
    protected Map<Enum, String> listaDeInteresse;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarUsuario(){
        cadastrarNome();
    }
    public void alterarInformacoesUsuario(){}
    private void cadastrarNome(){
        String nome;
        System.out.print("Olá, Digite seu nome: ");
        nome = scanner.nextLine();

        if (nome.isEmpty()){
            System.out.println("Não pode estar vazio seu nome");
        } else if (nome.length() > 50){
            System.out.println("Seu nome ultrapassou o máximo de cáracteres(50)");
        }
        usuario.setNome(nome);
    }
    private void cadastrarIdade(){}
    private void cadastrarEndereco(){}
}
