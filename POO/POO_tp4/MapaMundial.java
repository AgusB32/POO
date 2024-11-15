package POO_tp4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapaMundial {
    private Map<String, Continente> continentes;

    public MapaMundial() {
        continentes = new HashMap<>();
        inicializarDatos();
    }

    private void inicializarDatos() {

        Continente america = new Continente("América");
        Continente europa = new Continente("Europa");
        Continente asia = new Continente("Asia");
        Continente africa = new Continente("África");
        Continente oceania = new Continente("Oceanía");
        Continente antartida = new Continente("Antártida");

        continentes.put(america.getNombre(), america);
        continentes.put(europa.getNombre(), europa);
        continentes.put(asia.getNombre(), asia);
        continentes.put(africa.getNombre(), africa);
        continentes.put(oceania.getNombre(), oceania);
        continentes.put(antartida.getNombre(), antartida);

        Pais argentina = new Pais("Argentina", "Buenos Aires", america);
        Pais uruguay = new Pais("Uruguay", "Montevideo", america);
        Pais brasil = new Pais("Brasil", "Brasilia", america);
        Pais chile = new Pais("Chile", "Santiago", america);
        Pais paraguay = new Pais("Paraguay", "Asunción", america);
        Pais bolivia = new Pais("Bolivia", "Sucre", america);
        Pais españa = new Pais("España", "Madrid", europa);
        Pais francia = new Pais("Francia", "París", europa);
        Pais italia = new Pais("Italia", "Roma", europa);
        Pais portugal = new Pais("Portugal", "Lisboa", europa);

        america.agregarPais(argentina);
        america.agregarPais(uruguay);
        america.agregarPais(brasil);
        america.agregarPais(chile);
        america.agregarPais(paraguay);
        america.agregarPais(bolivia);
        europa.agregarPais(españa);
        europa.agregarPais(francia);
        europa.agregarPais(italia);
        europa.agregarPais(portugal);

        argentina.agregarProvincia(new Provincia("Entre Ríos", "Argentina"));
        argentina.agregarProvincia(new Provincia("Buenos Aires", "Argentina"));
        argentina.agregarProvincia(new Provincia("Santa Fé", "Argentina"));
        argentina.agregarProvincia(new Provincia("Corrientes", "Argentina"));
        argentina.agregarProvincia(new Provincia("Córdoba", "Argentina"));

        uruguay.agregarProvincia(new Provincia("Salto", "Uruguay"));
        uruguay.agregarProvincia(new Provincia("Paysandú", "Uruguay"));
        uruguay.agregarProvincia(new Provincia("Canelones", "Uruguay"));
        uruguay.agregarProvincia(new Provincia("Rocha", "Uruguay"));
        uruguay.agregarProvincia(new Provincia("Maldonado", "Uruguay"));

        argentina.agregarPaisLimitrofe(uruguay);
        argentina.agregarPaisLimitrofe(brasil);
        argentina.agregarPaisLimitrofe(chile);
        argentina.agregarPaisLimitrofe(paraguay);
        argentina.agregarPaisLimitrofe(bolivia);
        
        uruguay.agregarPaisLimitrofe(argentina);
        uruguay.agregarPaisLimitrofe(brasil);
        
        brasil.agregarPaisLimitrofe(argentina);
        brasil.agregarPaisLimitrofe(uruguay);
        brasil.agregarPaisLimitrofe(paraguay);
        brasil.agregarPaisLimitrofe(bolivia);
        brasil.agregarPaisLimitrofe(chile);
        
        chile.agregarPaisLimitrofe(argentina);
        chile.agregarPaisLimitrofe(brasil);
        chile.agregarPaisLimitrofe(bolivia);
        
        paraguay.agregarPaisLimitrofe(argentina);
        paraguay.agregarPaisLimitrofe(brasil);
        paraguay.agregarPaisLimitrofe(bolivia);
        
        bolivia.agregarPaisLimitrofe(argentina);
        bolivia.agregarPaisLimitrofe(brasil);
        bolivia.agregarPaisLimitrofe(chile);
        bolivia.agregarPaisLimitrofe(paraguay);
    }

    public Set<Pais> getPaises(String nombreContinente) {
        Continente continente = continentes.get(nombreContinente);
        if (continente != null) {
            return new HashSet<>(continente.getPaises());
        }
        return new HashSet<>();
    }

    public Set<Provincia> getProvincias(String nombrePais) {
        for (Continente continente : continentes.values()) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equals(nombrePais)) {
                    return new HashSet<>(pais.getProvincias());
                }
            }
        }
        return new HashSet<>();
    }

    public Set<Pais> getLimitrofes(String nombrePais) {
        for (Continente continente : continentes.values()) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equals(nombrePais)) {
                    return new HashSet<>(pais.getPaisesLimitrofes());
                }
            }
        }
        return new HashSet<>();
    }
}
