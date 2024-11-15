package POO_tp4;

public class Provincia {
    private String nombre;
    private String pais;

    public Provincia(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
