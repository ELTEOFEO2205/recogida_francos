/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.controlador;

import recogida_franc.interfaces.*;
import recogida_franc.modelo.*;

public class ControladorRecogidaFranco {

    private RepositorioCadete repositorioCadete;

    private RepositorioRegistroFranco repositorioRegistro;

    private LectorHuella lectorHuella;

    private Impresora impresora;

    public ControladorRecogidaFranco(
            RepositorioCadete repositorioCadete,
            RepositorioRegistroFranco repositorioRegistro,
            LectorHuella lectorHuella,
            Impresora impresora) {

        this.repositorioCadete = repositorioCadete;
        this.repositorioRegistro = repositorioRegistro;
        this.lectorHuella = lectorHuella;
        this.impresora = impresora;
    }

    public boolean registrarRecogida() {

        String huella =
                lectorHuella.capturarHuella();

        Cadete cadete =
                repositorioCadete.buscarPorHuella(
                        huella);

        if(cadete == null) {

            return false;
        }

        RegistroFranco registro =
                new RegistroFranco(
                        0,
                        cadete);

        repositorioRegistro.guardar(
                registro);

        impresora.imprimir(
                "Cadete: "
                + cadete.getNombre());

        return true;
    }
}