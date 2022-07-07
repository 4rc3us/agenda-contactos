package com.sofka;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

import static com.sofka.utilities.InputOutputUtilities.askFor;


public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto() {
        String nombre = askFor("nombre", false);
        String telefono = askFor("telefono", true);
        String email = askFor("email", false);

        contactos.add(new Contacto(contactos.size() + 1, nombre, email, telefono));
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public Contacto buscarContacto(String nombre) {
        // TODO : Pattern matching
        this.contactos.forEach(contacto -> {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println(contacto.getNombre());
            }
        });
        return null;
    }

    public Contacto buscarContacto(String numero, Integer id) {
        // TODO : Pattern matching
        this.contactos.forEach(contacto -> {
            if (contacto.getTelefono().equals(numero)) {
                System.out.println(contacto);
            }
        });
        return null;
    }

    public void Modificar(Contacto contacto) {
        int index = contactos.indexOf(contacto);

        String nombre = askFor("nombre", false);
        String telefono = askFor("telefono", true);
        String email = askFor("email", false);

        contactos.set(index, new Contacto(contacto.getId(), nombre, telefono, email));

    }
}
