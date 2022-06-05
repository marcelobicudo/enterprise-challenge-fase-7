package bean;

import java.sql.Date;

public class DadosMonitoramento {
    private int idMonitoramento;
    private int idRegiao;
    private int idDoenca;
    private int idFaixaEtaria;
    private int idZona;
    private Date dtRegistro;
    private char dsSexo;
    private boolean isGestante;
    private int nrCasosConfirmados;
    private int nrCasosSuspeitos;
    private int nrObitos;

    public DadosMonitoramento(int idMonitoramento, int idRegiao, int idDoenca, int idFaixaEtaria, int idZona, Date dtRegistro, char dsSexo, boolean isGestante, int nrCasosConfirmados, int nrCasosSuspeitos, int nrObitos) {
        this.idMonitoramento = idMonitoramento;
        this.idRegiao = idRegiao;
        this.idDoenca = idDoenca;
        this.idFaixaEtaria = idFaixaEtaria;
        this.idZona = idZona;
        this.dtRegistro = dtRegistro;
        this.dsSexo = dsSexo;
        this.isGestante = isGestante;
        this.nrCasosConfirmados = nrCasosConfirmados;
        this.nrCasosSuspeitos = nrCasosSuspeitos;
        this.nrObitos = nrObitos;
    }

    public int getIdMonitoramento() {
        return idMonitoramento;
    }

    public void setIdMonitoramento(int idMonitoramento) {
        this.idMonitoramento = idMonitoramento;
    }

    public int getIdRegiao() {
        return idRegiao;
    }

    public void setIdRegiao(int idRegiao) {
        this.idRegiao = idRegiao;
    }

    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public int getIdFaixaEtaria() {
        return idFaixaEtaria;
    }

    public void setIdFaixaEtaria(int idFaixaEtaria) {
        this.idFaixaEtaria = idFaixaEtaria;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public Date getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(Date dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public char getDsSexo() {
        return dsSexo;
    }

    public void setDsSexo(char dsSexo) {
        this.dsSexo = dsSexo;
    }

    public boolean isGestante() {
        return isGestante;
    }

    public void setGestante(boolean gestante) {
        isGestante = gestante;
    }

    public int getNrCasosConfirmados() {
        return nrCasosConfirmados;
    }

    public void setNrCasosConfirmados(int nrCasosConfirmados) {
        this.nrCasosConfirmados = nrCasosConfirmados;
    }

    public int getNrCasosSuspeitos() {
        return nrCasosSuspeitos;
    }

    public void setNrCasosSuspeitos(int nrCasosSuspeitos) {
        this.nrCasosSuspeitos = nrCasosSuspeitos;
    }

    public int getNrObitos() {
        return nrObitos;
    }

    public void setNrObitos(int nrObitos) {
        this.nrObitos = nrObitos;
    }
}
