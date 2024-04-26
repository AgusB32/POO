package POO.tp2;

public class ej5_empleado {
    
    private final int SUELDO_MINIMO = 100;
	private String nombre;
	private Integer sueldo;
	
	public ej5_empleado() {
		
	}
	
	public ej5_empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public ej5_empleado(String nombre, Integer sueldo) {
		this.nombre = nombre;
		this.setSueldo(sueldo);
	}

	public String getNombre() {
		return this.nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		if(sueldo > SUELDO_MINIMO) {
			this.sueldo = sueldo;
		}
	}

	@Override
	public String toString() {
		return "El empleado se llamma: " + this.getNombre() +
				" y tiene el siguiente sueldo: $" + this.getSueldo();
	}

}
