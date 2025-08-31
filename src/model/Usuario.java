package model;

import java.util.Map;

public class Usuario {
    private String nome;
    private int idade;
    private String endereco;
    private Map<Enum, String> listaDeInteresse;
    private Map<Enum, String> listaDeEventosConfirmados;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Map<Enum, String> getListaDeInteresse() {
        return listaDeInteresse;
    }

    public void setListaDeInteresse(Map<Enum, String> listaDeInteresse) {
        this.listaDeInteresse = listaDeInteresse;
    }

    public Map<Enum, String> getListaDeEventosConfirmados() {
        return listaDeEventosConfirmados;
    }

    public void setListaDeEventosConfirmados(Map<Enum, String> listaDeEventosConfirmados) {
        this.listaDeEventosConfirmados = listaDeEventosConfirmados;
    }
}
