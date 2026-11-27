/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recogida_franc.modelo;

public class Cadete {

    private int id;
    private String nombre;
    private String huellaRegistrada;
    private Villa villa;

    public Cadete(int id,
                  String nombre,
                  String huellaRegistrada,
                  Villa villa) {

        this.id = id;
        this.nombre = nombre;
        this.huellaRegistrada = huellaRegistrada;
        this.villa = villa;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHuellaRegistrada() {
        return huellaRegistrada;
    }

    public Villa getVilla() {
        return villa;
    }
}