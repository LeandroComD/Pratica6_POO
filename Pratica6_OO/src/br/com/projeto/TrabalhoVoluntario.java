package br.com.projeto;

public class  TrabalhoVoluntario extends Projeto {

    public String tipoTrabalho;
    public int duracaoTrabalho;


    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio,
                              String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto(int duracaoTrabalho) {
        if (getDuracaoTrabalho() > 2) {
            return true;
        } else
            return false;
    }

    public String imprimeProjeto() {

        return "Nome " + getNomeProjeto() + "\nDescricao " + getDescricao() + " \nData Inicio" + getDataInicio() + "\nData Final " +
                getDataFim() + "\nTipo" + getTipoTrabalho() + "\nDuracao " + getDuracaoTrabalho() + "\nEndereco " + getEndereco();
    }
}
