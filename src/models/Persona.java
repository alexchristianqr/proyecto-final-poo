
package models;

public class Persona {
    private int dni;
    private String nombre;
    private String apellidos;
    private String sexo;
    private int edad;
    private String ciudad;
    private int telefono;
    

      public Persona() {
    }

    public Persona(int dni, String nombre, String apellidos, String sexo, int edad, String ciudad, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
 
    
    
}
