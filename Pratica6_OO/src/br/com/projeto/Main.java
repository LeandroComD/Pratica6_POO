package br.com.projeto;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        int opcao;
        String nomeProjeto, descricao, endereco, dataInicio, dataFim;
        String descAlimento;
        float qtde;
        String tipoTrabalho;
        int duracaoTrabalho;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar Projeto Distribuir Alimentos \r\n <2> Cadastrar Projeto Trabalho Voluntário \r\n<3> Sair "));

        do {
            switch (opcao) {

                case 1:
                    nomeProjeto = JOptionPane.showInputDialog("Informe o nome do Projeto");
                    descricao = JOptionPane.showInputDialog("Descreva o Projeto");
                    endereco = JOptionPane.showInputDialog("Informe o endereco do Projeto");
                    dataInicio = JOptionPane.showInputDialog("Informe a data de Inicio do Projeto");
                    dataFim = JOptionPane.showInputDialog("Informe a data Final do Projeto");
                    descAlimento = JOptionPane.showInputDialog("Descreva o alimento");
                    qtde = Float.parseFloat(JOptionPane.showInputDialog("Informe quantidade de alimentos"));
                    DistribuicaoAlimento dA = new DistribuicaoAlimento(nomeProjeto, descricao, endereco, dataInicio, dataFim, descAlimento, qtde);

                    JOptionPane.showMessageDialog(null, dA.imprimeProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;

                case 2:
                    nomeProjeto = JOptionPane.showInputDialog("Informe o nome do Projeto");
                    descricao = JOptionPane.showInputDialog("Descreva o Projeto");
                    endereco = JOptionPane.showInputDialog("Informe o endereco do Projeto");
                    dataInicio = JOptionPane.showInputDialog("Informe a data de Inicio do Projeto");
                    dataFim = JOptionPane.showInputDialog("Informe a data Final do Projeto");
                    tipoTrabalho = JOptionPane.showInputDialog("Informe o tipo do trabalho");
                    duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Informe a duracao"));
                    TrabalhoVoluntario tV = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);

                    JOptionPane.showMessageDialog(null, tV.imprimeProjeto(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;

                case 3:

                    break;

                default:
                    JOptionPane.showInputDialog("Opcao invalida");
            }
        } while (opcao != 3);
    }
}
