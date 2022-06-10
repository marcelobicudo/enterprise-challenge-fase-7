package bean;

public class Regiao {
    private int idRegiao;
    private String nmRegiao;

    public Regiao(int idRegiao, String nmRegiao) {
        this.idRegiao = idRegiao;
        this.nmRegiao = nmRegiao;
    }

    public Regiao () {

    }

    public int getIdRegiao() {
        return idRegiao;
    }

    public void setIdRegiao(int idRegiao) {
        this.idRegiao = idRegiao;
    }

    public String getNmRegiao() {
        return nmRegiao;
    }

    public void setNmRegiao(String nmRegiao) {
        this.nmRegiao = nmRegiao;
    }
}
