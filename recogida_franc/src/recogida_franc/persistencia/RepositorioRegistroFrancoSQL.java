/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.persistencia;

import recogida_franc.modelo.ConexionBD;
import recogida_franc.modelo.RegistroFranco;
import recogida_franc.modelo.RepositorioRegistroFranco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioRegistroFrancoSQL
        implements RepositorioRegistroFranco {

    @Override
    public void guardar(RegistroFranco registro) {

        String sql =
                "INSERT INTO registro_franco(fecha_hora,id_cadete) "
                + "VALUES(?, ?)";

        try (Connection conexion =
                     ConexionBD.obtenerConexion();

             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setTimestamp(
                    1,
                    java.sql.Timestamp.valueOf(
                            registro.getFechaHora()
                    )
            );

            sentencia.setInt(
                    2,
                    registro.getCadete().getId()
            );

            sentencia.executeUpdate();

            System.out.println(
                    "Registro guardado correctamente."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Error al guardar registro: "
                    + e.getMessage()
            );
        }
    }

    @Override
    public List<RegistroFranco> listar() {

        return new ArrayList<>();

    }
}