package models;

public class Cliente extends Persona {

    private int idCliente;

    public Cliente() {
    }

    public Cliente(Cliente cliente) {
        super(cliente.getDni(), cliente.getNombre(), cliente.getApellidos(), cliente.getSexo(), cliente.getEdad(), cliente.getTelefono(), cliente.getEstado(), cliente.getFechaCreado(), cliente.getFechaActualizado());
        this.idCliente = cliente.getIdCliente();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}
