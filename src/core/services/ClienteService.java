package core.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.Cliente;

public class ClienteService extends BaseService {

    public ClienteService() {
        db = new MysqlDBService();
    }

    public DefaultTableModel listarClientesService(DefaultTableModel modelo, Object[] data) {
        querySQL_1 = "SELECT c.id, p.telefono, p.`nombre`,p.`apellido`, p.`edad`, p.`nrodocumento`, p.`sexo`, p.`tipo_documento`, p.`fecha_creado` FROM clientes c JOIN personas p ON p.id = c.id_persona";
        Object[] parametrosSQL_1 = {};
        ResultSet rs = db.queryConsultar(querySQL_1, parametrosSQL_1);

        try {
            while (rs.next()) {
                data[0] = rs.getInt("id");
                data[1] = rs.getString("nombre");
                data[2] = rs.getString("apellido");
                data[3] = rs.getInt("tipo_documento");
                data[4] = rs.getString("nrodocumento");
                data[5] = rs.getString("sexo");
                data[6] = rs.getString("telefono");
                data[7] = rs.getString("edad");
                data[8] = rs.getString("fecha_creado");
                data[9] = null;
                modelo.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.cerrarConsulta();
        return modelo;
    }

    public void crearClienteService(Cliente cliente) {
        querySQL_1 = "insert into personas (nombre, apellido, tipo_documento, nrodocumento, sexo, edad, telefono, fecha_creado) values (?,?,?,?,?,?,?,?)";
        Object[] parametrosSQL_1 = {cliente.getNombre(), cliente.getApellidos(), cliente.getTipoDocumento(), cliente.getNroDocumento(), cliente.getSexo(), cliente.getEdad(), cliente.getTelefono(), cliente.getFechaCreado()};
        int id_persona = db.queryInsertar(querySQL_1, parametrosSQL_1);

        querySQL_2 = "insert into clientes (id_persona, empresa, fecha_creado) values (?,?,?)";
        Object[] parametrosSQL_2 = {id_persona, cliente.getNombre() + ' ' + cliente.getApellidos(), cliente.getFechaCreado()};
        db.queryInsertar(querySQL_2, parametrosSQL_2);

        db.cerrarConsulta();
    }
}
