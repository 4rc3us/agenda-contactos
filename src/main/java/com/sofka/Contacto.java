package com.sofka;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacto {
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;

    public Contacto() {}

    public Contacto(Integer id, String nombre, String direccion, String telefono) {
        this.id        = id;
        this.nombre    = nombre;
        this.direccion = direccion;
        this.telefono  = telefono;
    }
}
