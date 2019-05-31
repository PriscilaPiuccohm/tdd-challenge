package infracao;

import java.time.LocalDate;


public class AutoInfracao {

    private String placa;
    private Long orgao;
    private String numeroAuto;
    private String codigoInfracao;
    private LocalDate dataAutuacao;
    private String pontos;
    private String situacao;


    AutoInfracao(String placa, long orgao, String numeroAuto, String codigoInfracao, LocalDate dataAutuacao, String pontos, String situacao) {
        this.placa = placa;
        this.orgao = orgao;
        this.numeroAuto = numeroAuto;
        this.codigoInfracao = codigoInfracao;
        this.dataAutuacao = dataAutuacao;
        this.pontos = pontos;
        this.situacao = situacao;
    }

    public AutoInfracao() {

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getOrgao() {
        return orgao;
    }

    public void setOrgao(long orgao) {
        this.orgao = orgao;
    }

    public String getNumeroAuto() {
        return numeroAuto;
    }

    public void setNumeroAuto(String numeroAuto) {
        this.numeroAuto = numeroAuto;
    }

    public String getCodigoInfracao() {
        return codigoInfracao;
    }

    public void setCodigoInfracao(String codigoInfracao) {
        this.codigoInfracao = codigoInfracao;
    }

    public LocalDate getDataAutuacao() {
        return dataAutuacao;
    }

    public void setDataAutuacao(LocalDate dataAutuacao) {
        this.dataAutuacao = dataAutuacao;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setOrgao(Long orgao) {
        this.orgao = orgao;
    }


    public int numeroDePontosGravidade() {
        String valor = getPontos().substring(0,1);
        int ponto = Integer.parseInt(valor);


       return ponto;


    }
}



