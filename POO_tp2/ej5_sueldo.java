package POO_tp2;

import java.util.HashSet;
import java.util.Iterator;

public class ej5_sueldo {
        public static void main(String[] args) {
            
            var empleados = new HashSet<ej5_empleado>();
            
            var ee = new ej5_empleado("Santiago", 60000);
            
            empleados.add(ee);
            empleados.add(new ej5_empleado("Martin", 130000));
            empleados.add(new ej5_empleado("Lucas", 800000));
            empleados.add(ee);
            empleados.add(new ej5_empleado("Valentina", 700000));
            empleados.add(new ej5_empleado("Sofia", 1000000));
            empleados.add(ee);
            empleados.add(new ej5_empleado("Martina", 3000000));
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