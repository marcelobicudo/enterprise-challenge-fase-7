package bean;

public class Doenca {
    private int idDoenca;
    private String nmDoenca;

    public Doenca(int idDoenca, String nmDoenca) {
        this.idDoenca = idDoenca;
        this.nmDoenca = nmDoenca;
    }

    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public String getNmDoenca() {
        return nmDoenca;
    }

    public void setNmDoenca(String nmDoenca) {
        this.nmDoenca = nmDoenca;
    }
}
