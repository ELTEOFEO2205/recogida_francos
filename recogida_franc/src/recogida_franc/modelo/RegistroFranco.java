/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.modelo;

import java.time.LocalDateTime;

public class RegistroFranco {

    private int idRegistro;
    private LocalDateTime fechaHora;
    private Cadete cadete;

    public RegistroFranco(
            int idRegistro,
            Cadete cadete) {

        this.idRegistro = idRegistro;
        this.cadete = cadete;
        this.fechaHora = LocalDateTime.now();
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Cadete getCadete() {
        return cadete;
    }
}