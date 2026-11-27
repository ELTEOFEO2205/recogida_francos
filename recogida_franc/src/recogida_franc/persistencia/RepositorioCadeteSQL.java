/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.persistencia;

import recogida_franc.modelo.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioCadeteSQL
        implements RepositorioCadete {

    @Override
    public void guardar(Cadete cadete) {

        String sql =
                "INSERT INTO cadete(nombre,huella) VALUES (?,?)";

        try (Connection conexion =
                     ConexionBD.obtenerConexion();

             PreparedStatement sentencia =
                     conexion.prepareStatement(sql)) {

            sentencia.setString(
                    1,
                    cadete.getNombre());

            sentencia.setString(
                    2,
                    cadete.getHuellaRegistrada());

            sentencia.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
    }

    @Override
    public Cadete buscarPorId(int id) {
        return null;
    }

    @Override
    public Cadete buscarPorHuella(String huella) {
        return null;
    }

    @Override
    public List<Cadete> listar() {
        return new ArrayList<>();
    }
}