package br.com.revista;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {

        int numero,volume,tiragem;
        String dataEdicao, titulo, peridiocidade, tituloRevista, resumo, autores;
        long issn;

        tituloRevista= JOptionPane.showInputDialog("Titulo da revista");
        issn=Long.parseLong(JOptionPane.showInputDialog("ISSN"));
        peridiocidade=JOptionPane.showInputDialog("Periodicidade");

        numero= Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        volume= Integer.parseInt(JOptionPane.showInputDialog("Volume"));
        tiragem= Integer.parseInt(JOptionPane.showInputDialog("Tiragem"));
        dataEdicao=JOptionPane.showInputDialog("Data de Edicao");

        Edicao ed1 = new Edicao(numero,volume, dataEdicao, tiragem);
        RevistaCientifica rv1 = new RevistaCientifica(tituloRevista,issn,peridiocidade,ed1);

        ArrayList<Artigo> artigos = new ArrayList<>();

        for (int i=0;i<10;i++){
            titulo = JOptionPane.showInputDialog("Titulo da artigo");
            resumo = JOptionPane.showInputDialog("Resumo");
            autores = JOptionPane.showInputDialog("Autores");
            artigos.add(new Artigo(titulo, resumo, autores));
            ed1.adicionaArtigos(artigos.get(i));
        }

    }

}
