package lab.pkg2p2_andrés_nuila;

public class casa {

    private int noCasa;
    private int noBloque;
    private String color;
    private int ancho;
    private int largo;
    private String dueño;
    private String estado;
    private String ingeniero;
    
    //contructor vacio
    public casa() {

    }

    //casa sin dueño
    public casa(int noCasa, int noBloque, String color, int ancho, int largo, String estado, String ingeniero) {
        this.noCasa = noCasa;
        this.noBloque = noBloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.estado = estado;
        this.ingeniero = ingeniero;
    }

    //casa con dueño
    public casa(int noCasa, int noBloque, String color, int ancho, int largo, String dueño, String estado, String ingeniero) {
        this.noCasa = noCasa;
        this.noBloque = noBloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.dueño = dueño;
        this.estado = estado;
        this.ingeniero = ingeniero;
    }

    public int getNoCasa() {
        return noCasa;
    }

    public void setNoCasa(int noCasa) {
        this.noCasa = noCasa;
    }

    public int getNoBloque() {
        return noBloque;
    }

    public void setNoBloque(int noBloque) {
        this.noBloque = noBloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

}
