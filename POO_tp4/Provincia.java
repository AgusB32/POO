package POO_tp4;

public class Provincia {
        public static void main(String[] args) {
            
        }
    
        private String nombre;
        private String pais;
    
        public Provincia(String nombre, String pais){
            this.nombre = nombre;
            this.pais = pais;
        }
    
        public String getNombre(){
            return nombre;
        }
    
        public void setNombre (String nombre) {
            this.nombre = nombre;
        }
    
        public String getPais() {
            return pais;
        }
    
        public void setPais(String pais) {
            this.pais = pais;
        }
        
    }