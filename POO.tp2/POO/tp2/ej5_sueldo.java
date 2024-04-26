package POO.tp2;

import java.util.HashSet;
import java.util.Iterator;


public class ej5_sueldo {
        public static void main(String[] args) {
    
            
            var empleados = new HashSet<ej5_empleado>();
            
            var ee = new ej5_empleado("Juan", 50000);
            
            empleados.add(ee);
            empleados.add(new ej5_empleado("Maria", 100000));
            empleados.add(new ej5_empleado("Felipe", 80000));
            empleados.add(ee);
            empleados.add(new ej5_empleado("Matias", 70000));
            empleados.add(new ej5_empleado("Sol", 90000));
            empleados.add(ee);
            empleados.add(new ej5_empleado("Pepe", 90000));
            empleados.add(ee);
            
            Integer total = 0;

        /*	for(int i = 0; i < empleados.length; i++) {
                total += empleados[i].getSueldo();
            }
            */
            for(ej5_empleado e : empleados) {
    
                total += e.getSueldo();
                System.out.println(e);
            }
            
            Iterator<ej5_empleado> i = empleados.iterator();
            while(i.hasNext()) {
                ej5_empleado e = i.next();
                
                if(e.getSueldo() > 90000)
                    i.remove();
        
            }
            
            for(ej5_empleado e : empleados) {
    
                System.out.println(e);
            }
            
            
    
            System.out.println(total / empleados.size());
        }
    
    }