package br.com.projeto;

public class DistribuicaoAlimento extends Projeto {
    public String descAlimento;
    public float qtde;
    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
                                String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }
    public String getDescAlimento() {
        return descAlimento;
    }
    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }
    public float getQtde() {
        return qtde;
    }
    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(String dataFim) {
        if (getDataFim()!= null) {
            return true;
        }else
            return false;
    }
    public String imprimeProjeto() {

        return "Nome " + getNomeProjeto() + "\nDescricao " + getDescricao() + " \nData Inicio" + getDataInicio() + "\nData Final " +
                getDataFim() + "\nEndereco " + getEndereco();
    }



}