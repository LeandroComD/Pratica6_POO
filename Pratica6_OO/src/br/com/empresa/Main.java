package br.com.empresa;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome, email, telefone, departamento, dataEntrada, rg, nomeEmp, cnpj;
        double salario;
        boolean status = true;
        int qtdeFuncionario;

        Scanner ler = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[10];
        Funcionario func;
        Empresa emp1;

        for (int i=0; i<10; i++){
            nome= JOptionPane.showInputDialog("Nome");
            email= JOptionPane.showInputDialog("E-mail");
            telefone= JOptionPane.showInputDialog("Telefone");
            departamento= JOptionPane.showInputDialog("Departamento");
            dataEntrada= JOptionPane.showInputDialog("Data de entrada");
            rg= JOptionPane.showInputDialog("RG");
            salario= Double.parseDouble(JOptionPane.showInputDialog("Salario"));
            func = new Funcionario( nome, email, telefone, departamento, salario, dataEntrada, rg, status);
            funcionarios[i] = func;
        }

        nomeEmp=JOptionPane.showInputDialog("Criando empresa, digite o nome: ");
        cnpj=JOptionPane.showInputDialog("CNPJ");
        qtdeFuncionario=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionario"));
        emp1 = new Empresa(nomeEmp, cnpj,qtdeFuncionario);

        for (Funcionario func1:funcionarios){
            emp1.insereFuncionario(func1);
            JOptionPane.showMessageDialog(null,func1.mostrarDados(), "Mensagem", JOptionPane.DEFAULT_OPTION);
        }


    }
}
