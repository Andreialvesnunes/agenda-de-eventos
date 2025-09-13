package controller;

import model.Usuario;

import java.util.Map;
import java.util.Scanner;

public class UsuarioController {
    private Usuario usuario = new Usuario();
    protected Map<Enum, String> listaDeEventoConfirmados;
    protected Map<Enum, String> listaDeInteresse;
    private Validacao validacao = new Validacao();
    Scanner scanner = new Scanner(System.in);

    public void cadastrarUsuario(){
        cadastrarNome();
        cadastrarIdade();
        cadastrarEndereco();
    }
    private void cadastrarNome(){
        String nome;
        System.out.print("Olá, Digite seu nome: ");
        nome = scanner.nextLine();
        nome = validacao.validacaoString("nome", nome, 50, scanner);
        usuario.setNome(nome);

    }
    private void cadastrarIdade(){
        int idade;
        System.out.println("Olá, " + usuario.getNome());
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 0 || idade >= 115){
            while (idade < 0 || idade > 120){
                System.out.println("Idade inválida");
                System.out.print("Por favor, digitar novamente: ");
                idade = scanner.nextInt();
            }
        }
        usuario.setIdade(idade);
    }
    private void cadastrarEndereco(){
        String endereco;
        System.out.print("Digite seu endereço: ");
        endereco = scanner.next();
        endereco = validacao.validacaoString("endereço",endereco, 70, scanner);
        usuario.setEndereco(endereco);
    }
    public void alterarInformacoesUsuario(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("[1] - Alterar Nome \n[2] - Alterar Idade \n[3] - Alterar Endereço");
        System.out.print("Selecione uma opção: ");
        int alternativa = scanner1.nextInt();
        scanner.nextLine();
        if (alternativa == 1){
            cadastrarNome();
        } else if (alternativa == 2) {
            cadastrarIdade();
        } else if (alternativa == 3) {
            cadastrarEndereco();
        } else {
            System.out.println("Essa opção não existe");
        }
    }
}
