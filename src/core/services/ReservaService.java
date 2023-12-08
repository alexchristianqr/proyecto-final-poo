package core.services;

import core.db.MysqlDBService;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import models.Reserva;

public class ReservaService extends BaseService {
      public ReservaService() {
        db = new MysqlDBService();
    }

    public DefaultTableModel listarReservas(DefaultTableModel modelo, Object[] data) {
        querySQL_1 = "SELECT * FROM reservas";
        Object[] parametrosSQL_1 = {};
        ResultSet rs = db.queryConsultar(querySQL_1, parametrosSQL_1);

        try {
            while (rs.next()) {
                data[0] = rs.getInt("id");
                data[1] = rs.getString("id_cliente");
                data[2] = rs.getString("id_habitacion");
                data[3] = rs.getString("id_empleado");
                data[4] = rs.getString("tipo");
                data[5] = rs.getString("descripcion");
                data[6] = rs.getString("estado");
                data[7] = rs.getString("total");
                data[8] = rs.getString("fecha_reserva");
                data[9] = rs.getString("fecha_ingreso");
                data[10] = rs.getString("fecha_salida");
                data[11] = rs.getString("fecha_creado");
                data[12] = rs.getString("fecha_actualizado");
                modelo.addRow(data);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        db.cerrarConsulta();
        return modelo;
    }

    public void crearReserva(Reserva reserva) {
//        querySQL_1 = "INSERT INTO reservas VALUES (?,?,?,?,?,?,?)";
        querySQL_1 = "INSERT INTO `dbhotel`.`reservas` (`id_cliente`, `id_habitacion`, `id_empleado`, `monto_total`, `estado`, `fecha_reserva`, `fecha_entrada`, `fecha_salida`, `fecha_creado`) VALUES ('1', '1', '1', '2', 'activo', '2023-12-06 11:04:49', '2023-12-06 11:04:51', '2023-12-06 11:05:21', '2023-12-06 11:04:58')";
        Object[] parametrosSQL_1 = {reserva.getIdCliente()};
        db.queryInsertar(querySQL_1, parametrosSQL_1);

        db.cerrarConsulta();
    }

//    public void actualizarReserva(Habitacion habitacion) {
//        querySQL_1 = "UPDATE reservas SET estado = ? WHERE id = ?";
//        Object[] parametrosSQL_1 = {habitacion.getEstado(), habitacion.getIdHabitacion()};
//        db.queryActualizar(querySQL_1, parametrosSQL_1);
//
//        db.cerrarConsulta();
//    }
}
