package bean;

public class Zona {
    private int idZona;
    private String nmZona;

    public Zona(int idZona, String nmZona) {
        this.idZona = idZona;
        this.nmZona = nmZona;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getNmZona() {
        return nmZona;
    }

    public void setNmZona(String nmZona) {
        this.nmZona = nmZona;
    }
}
