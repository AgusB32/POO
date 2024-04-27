package POO_tp4
import java.util.HashSet;
import java.util.Set;

public class paises {
        private String nombre;
        private String capital;
        private Continente continente;
        private Set
    
        <Provincia> provincias;

        <Provincia> provincias;
        private Set<Pais> paisesLimitrofes;
    
        public Pais(String nombre, String capital, Continente continente) {
            this.nombre = nombre;
            this.capital = capital;
            this.continente = continente;
            this.provincias = new HashSet<>();
            this.paisesLimitrofes = new HashSet<>();
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public String getCapital() {
            return capital;
        }
    
        public Continente getContinente() {
            return continente;
        }
    
        public void agregarProvincia(Provincia provincia) {
            provincias.add(provincia);
        }
    
        public Set

        <Provincia> getProvincias() {
            return provincias;
        }
    
        public void agregarPaisLimitrofe(Pais pais) {
            paisesLimitrofes.add(pais);
        }
    
        public Set<Pais> getPaisesLimitrofes() {
            return paisesLimitrofes;
        }
    
        @Override
        public String toString() {
            return "Pais{" +
                    "nombre='" + nombre + '\'' +
                    ", capital='" + capital + '\'' +
                    ", continente=" + continente.getNombre() +
                    '}';
        }
    }
