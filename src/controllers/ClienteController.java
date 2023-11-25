package controllers;

import java.sql.ResultSet;
import core.services.MysqlDBService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class ClienteController extends BaseController<Cliente> implements ClienteControllerInterface {

    private final MysqlDBService service;

    public ClienteController() {
        service = new MysqlDBService();
    }

    @Override
    public DefaultTableModel listarClientes(String buscar) {
        DefaultTableModel modelo;
        String[] columnNames = {"Código", "Nombres", "Apellidos", "DNI", "Edad", "Sexo", "Telefono", "Estado", "Fecha creado", "Fecha actualizado"};
        Object[] data = new Object[columnNames.length];
        modelo = new DefaultTableModel(null, columnNames);

        lista = listarClientesService();

        for (Cliente oCliente : lista) {
            data[0] = oCliente.getIdCliente();
            data[1] = oCliente.getNombre();
            data[2] = oCliente.getApellidos();
            data[3] = oCliente.getNroDocumento();
            data[4] = oCliente.getEdad();
            data[5] = oCliente.getSexo();
            data[6] = oCliente.getTelefono();
            data[7] = oCliente.getEstado();
            data[8] = oCliente.getFechaCreado();
            data[9] = oCliente.getFechaActualizado();
            modelo.addRow(data);
        }

        return modelo;
    }

    @Override
    public Cliente crearCliente(Cliente cliente) {

        Cliente oCliente = new Cliente(cliente);
        oCliente.setIdCliente(idAutoincrementado());
        lista.add(oCliente);

        crearClienteService(cliente);

        return oCliente;
    }

    public List<Cliente> listarClientesService() {
        querySQL_1 = "SELECT c.*,p.`nombre`,p.`apellido`, p.`edad`,p.`nrodocumento`, p.`sexo`, p.`tipo_documento`,p.`fecha_creado` FROM clientes c JOIN personas p ON p.id = c.id_persona";
        Object[] parametrosSQL_1 = {};
        ResultSet rs = service.queryConsultar(querySQL_1, parametrosSQL_1);
        List<Cliente> lista = new ArrayList<>();

        try {
            lista.clear();
            Cliente cliente = new Cliente();

            while (rs.next()) {
                cliente.setIdCliente(rs.getInt("id"));
                cliente.setIdPersona(rs.getInt("id_persona"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellido"));
                cliente.setTipoDocumento(rs.getInt("tipo_documento"));
                cliente.setNroDocumento(rs.getString("nrodocumento"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setEdad(rs.getString("edad"));
                cliente.setFechaCreado(rs.getString("fecha_creado"));
                lista.add(cliente);
            }

            service.desconectar();
            service.cerrarConsulta();

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void crearClienteService(Cliente cliente) {
        querySQL_1 = "insert into personas (nombre, apellido, tipo_documento, nrodocumento, sexo, edad, fecha_creado) values (?,?,?,?,?,?,?)";
        Object[] parametrosSQL_1 = {cliente.getNombre(), cliente.getApellidos(), cliente.getTipoDocumento(), cliente.getNroDocumento(), cliente.getSexo(), cliente.getEdad(), cliente.getFechaCreado()};
        int id_persona = service.queryInsertar(querySQL_1, parametrosSQL_1);

        querySQL_2 = "insert into clientes (id_persona, empresa, fecha_creado) values (?,?,?)";
        Object[] parametrosSQL_2 = {id_persona, cliente.getNombre() + ' ' + cliente.getApellidos(), cliente.getFechaCreado()};
        service.queryInsertar(querySQL_2, parametrosSQL_2);

        service.desconectar();
        service.cerrarConsulta();
    }

}
