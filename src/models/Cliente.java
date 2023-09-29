package models;

public class Cliente extends Persona {

    private int codigo;

    public Cliente() {}
    
    public Cliente(Cliente cliente) {
        super(cliente.getDni(), cliente.getNombre(), cliente.getApellidos(), cliente.getSexo(), cliente.getEdad(), cliente.getCiudad(), cliente.getTelefono());
        this.codigo = cliente.getCodigo();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
