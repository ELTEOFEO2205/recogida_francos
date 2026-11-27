/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.principal;

import recogida_franc.controlador.ControladorRecogidaFranco;
import recogida_franc.interfaces.Impresora;
import recogida_franc.interfaces.LectorHuella;
import recogida_franc.modelo.RepositorioCadete;
import recogida_franc.modelo.RepositorioRegistroFranco;
import recogida_franc.persistencia.RepositorioCadeteSQL;
import recogida_franc.persistencia.RepositorioRegistroFrancoSQL;

public class Main {

    public static void main(String[] args) {

        RepositorioCadete repositorioCadete =
                new RepositorioCadeteSQL();

        RepositorioRegistroFranco
                repositorioRegistro =
                new RepositorioRegistroFrancoSQL();

        LectorHuella lectorHuella = null;

        Impresora impresora = null;

        ControladorRecogidaFranco controlador =
                new ControladorRecogidaFranco(
                        repositorioCadete,
                        repositorioRegistro,
                        lectorHuella,
                        impresora);

        System.out.println(
                "Sistema iniciado correctamente."
                
                
          
        );
    }
}
