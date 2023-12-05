package core.services;

import core.db.MysqlDBService;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import models.Habitacion;

public class HabitacionService extends BaseService {

    public HabitacionService() {
        db = new MysqlDBService();
    }

    public DefaultTableModel listarHabitaciones(DefaultTableModel modelo, Object[] data) {
        querySQL_1 = "SELECT  * FROM habitaciones";
        Object[] parametrosSQL_1 = {};
        ResultSet rs = db.queryConsultar(querySQL_1, parametrosSQL_1);

        try {
            while (rs.next()) {
                data[0] = rs.getInt("id");
                data[1] = rs.getString("id_tipohabitacion");
                data[2] = rs.getString("descripcion");
                data[3] = rs.getInt("nivel");
                data[4] = rs.getString("numero_piso");
                data[5] = rs.getInt("precio");
                data[6] = rs.getInt("cantidad_camas");
                data[7] = rs.getString("estado");
                data[8] = rs.getString("fecha_creado");
                data[9] = rs.getString("fecha_actualizado");
                modelo.addRow(data);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        db.cerrarConsulta();
        return modelo;
    }

    public void crearHabitacion(Habitacion habitacion) {
        querySQL_1 = "INSERT INTO habitaciones (id_tipohabitacion, descripcion, nivel, numero_piso, precio, cantidad_camas, estado, fecha_creado) VALUES (?,?,?,?,?,?,?)";
        Object[] parametrosSQL_2 = {habitacion.getIdHabitacion(), habitacion.getDescripcion(), habitacion.getNivel(), habitacion.getNumeroPiso(), habitacion.getPrecio(), habitacion.getCantidadCamas(), habitacion.getEstado(), habitacion.getFechaCreado()};
        db.queryInsertar(querySQL_1, parametrosSQL_2);

        db.cerrarConsulta();
    }

    public void actualizarHabitacion(Habitacion habitacion) {
        querySQL_1 = "UPDATE habitaciones SET estado = ? WHERE id = ?";
        Object[] parametrosSQL_1 = {habitacion.getEstado(), habitacion.getIdHabitacion()};
        db.queryActualizar(querySQL_1, parametrosSQL_1);

        db.cerrarConsulta();
    }
}
