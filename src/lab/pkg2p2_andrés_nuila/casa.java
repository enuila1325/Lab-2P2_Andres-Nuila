package lab.pkg2p2_andrés_nuila;

public class casa {

    private int noCasa;
    private int noBloque;
    private int pisos;
    private int baños;
    private int cuartos;
    private String estadoCompra;
    private String color;
    private int ancho;
    private int largo;
    private String dueño;
    private String estado;
    private String ingeniero;

    //contructor vacio
    public casa() {

    }

    public casa(int noCasa, int noBloque, String color, int ancho, int largo, int pisos, int baños, int cuartos, String estado, String ingeniero, String estadoCompra, String dueño) {
        this.noCasa = noCasa;
        this.noBloque = noBloque;
        this.color = color;
        this.baños = baños;
        this.cuartos = cuartos;
        this.pisos = pisos;
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

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(String estadoCompra) {
        this.estadoCompra = estadoCompra;
    }
    

    @Override
    public String toString() {
        return "noCasa=" + noCasa + "  noBloque=" + noBloque + "  pisos=" + pisos + "  baños=" + baños + "  cuartos=" + cuartos + "  estadoCompra=" + estadoCompra + "  color=" + color + "  ancho=" + ancho + "  largo=" + largo + "  dueño=" + dueño + "  estado=" + estado + "  ingeniero=" + ingeniero;
    }

}
