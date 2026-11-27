/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.modelo;

public class Villa {

    private int numeroVilla;
    private int numeroPabellon;

    public Villa(int numeroVilla, int numeroPabellon) {
        this.numeroVilla = numeroVilla;
        this.numeroPabellon = numeroPabellon;
    }

    public int getNumeroVilla() {
        return numeroVilla;
    }

    public int getNumeroPabellon() {
        return numeroPabellon;
    }
}