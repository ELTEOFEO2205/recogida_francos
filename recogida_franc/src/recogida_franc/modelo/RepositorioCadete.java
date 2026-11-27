/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.modelo;

import java.util.List;

public interface RepositorioCadete {

    void guardar(Cadete cadete);

    Cadete buscarPorId(int id);

    Cadete buscarPorHuella(String huella);

    List<Cadete> listar();
}