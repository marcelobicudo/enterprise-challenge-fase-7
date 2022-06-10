package bean;

public class FaixaEtaria {
    private int idFaixaEtaria;
    private int vlIdadeInicial;
    private int vlIdadeFinal;

    public FaixaEtaria(int idFaixaEtaria, int vlIdadeInicial, int vlIdadeFinal) {
        this.idFaixaEtaria = idFaixaEtaria;
        this.vlIdadeInicial = vlIdadeInicial;
        this.vlIdadeFinal = vlIdadeFinal;
    }

    public FaixaEtaria() {

    }

    public int getIdFaixaEtaria() {
        return idFaixaEtaria;
    }

    public void setIdFaixaEtaria(int idFaixaEtaria) {
        this.idFaixaEtaria = idFaixaEtaria;
    }

    public int getVlIdadeInicial() {
        return vlIdadeInicial;
    }

    public void setVlIdadeInicial(int vlIdadeInicial) {
        this.vlIdadeInicial = vlIdadeInicial;
    }

    public int getVlIdadeFinal() {
        return vlIdadeFinal;
    }

    public void setVlIdadeFinal(int vlIdadeFinal) {
        this.vlIdadeFinal = vlIdadeFinal;
    }
}
