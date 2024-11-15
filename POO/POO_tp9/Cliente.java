package POO_tp9;

public class Cliente {
    private String nombre;
    private String cuit;
    private String email;
    private String celular;

    public Cliente(String nombre, String cuit, String email, String celular) {
        if (nombre == null || nombre.length() < 2) 
            throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres.");
        if (!validarCuit(cuit)) 
            throw new IllegalArgumentException("CUIT inválido.");
        if (!validarEmail(email)) 
            throw new IllegalArgumentException("Email inválido.");
        if (!validarCelular(celular)) 
            throw new IllegalArgumentException("Celular inválido.");
        this.nombre = nombre;
        this.cuit = cuit;
        this.email = email;
        this.celular = celular;
    }

    private boolean validarCuit(String cuit) {
        return cuit.matches("\\d{2}-\\d{8}-\\d"); // Ejemplo: 20-12345678-9
    }

    private boolean validarEmail(String email) {
        return email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$");
    }

    private boolean validarCelular(String celular) {
        return celular.matches("\\+?\\d{10,15}"); // Ejemplo: +5491112345678
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
}
