package br.com.senac.imc.dtos;

public class CalcularimcResponseDTO {

    private double imc;

    private String classificacao;

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
