/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.modelo;

import java.util.List;

public interface RepositorioRegistroFranco {

    void guardar(RegistroFranco registro);

    List<RegistroFranco> listar();

}