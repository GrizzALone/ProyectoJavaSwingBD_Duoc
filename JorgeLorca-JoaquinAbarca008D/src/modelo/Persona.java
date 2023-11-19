package modelo;

public abstract class Persona {
    private String rut, nombre;
    private int edad, telefono;

    public Persona(String rut, String nombre, int edad, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public abstract void migrar(int num, String palabra);
}
