package br.com.empresa;


public class Empresa {
    private String nome;
    private String cnpj;
    private int qtde_de_funcionario;
    private static int cont = 0;
    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtde_de_funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        if (qtde_de_funcionario <= 100) {
            this.qtde_de_funcionario = qtde_de_funcionario;
            funcionarios = new Funcionario[qtde_de_funcionario];
        } else {
            this.qtde_de_funcionario = 100;
            funcionarios = new Funcionario[100];
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtde_de_funcionario() {
        return qtde_de_funcionario;
    }

    public void setQtde_de_funcionario(int qtde_de_funcionario) {
        this.qtde_de_funcionario = qtde_de_funcionario;
    }


    public void insereFuncionario(Funcionario func){
        funcionarios[cont]=func;
        cont++;
    }
}
