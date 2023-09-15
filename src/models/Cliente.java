package models;

public class Cliente extends Persona {

    private int codigo;

    public Cliente(int codigo, String dni, String nombre, String apellidos, String sexo, String edad, String ciudad, String telefono) {
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
