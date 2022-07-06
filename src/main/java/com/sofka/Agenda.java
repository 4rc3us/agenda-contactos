package com.sofka;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public void buscarContacto(String nombre) {
        this.contactos.forEach(contacto -> {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println(contacto.getNombre());
            }
        });
    }

    public void buscarContacto(String numero, Integer id) {
        this.contactos.forEach(contacto -> {
            if (contacto.getTelefono().equals(numero)) {
                System.out.println(contacto);
            }
        });
    }

    public void Modificar() {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals("Juan")) {
                contacto.setNombre("Juanito");
            }
        }
    }
}
