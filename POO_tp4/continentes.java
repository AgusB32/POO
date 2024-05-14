package POO_tp4;

import java.util.ArrayList;
import java.util.List;

public class continentes {
        private String nombre;
        private List<Pais> paises;
    
        public Continente(String nombre) {
            this.nombre = nombre;
            this.paises = new ArrayList<>();
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void agregarPais(Pais pais) {
            paises.add(pais);
        }
    
        public List<Pais> getPaises() {
            return paises;
        }
    
        @Override
        public String toString() {
            return "Continente: " + nombre;
        }
    }
