package models;

public class Cliente extends Persona {

    private int codigo;

    public Cliente(int codigo, int dni, String nombre, String apellidos, String sexo, int edad, String ciudad, int telefono) {
        super(dni, nombre, apellidos, sexo, edad, ciudad, telefono);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
