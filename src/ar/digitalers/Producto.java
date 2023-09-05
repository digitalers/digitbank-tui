package ar.digitalers;

public class Producto {
    private int id;
    private String Nombre;
    private String Descripcion;
    private String Condiciones;
    private double Costo;
    private String Beneficios;

     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    /**
     * @return
     */
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getCondiciones() {
        return Condiciones;
    }
    public void setCondiciones(String condiciones) {
        Condiciones = condiciones;
    }
    public double getCosto() {
        return Costo;
    }
    public void setCosto(double costo) {
        Costo = costo;
    }
    public String getBeneficios() {
        return Beneficios;
    }
    public void setBeneficios(String beneficios) {
        Beneficios = beneficios;
    }

    // Constructor, getters y setters
    
}