package com.sofka;

import static com.sofka.utilities.InputOutputUtilities.askFor;
import static com.sofka.utilities.InputOutputUtilities.menuMaker;

public class Menuprincipal {

    int selection;

    public Menuprincipal() {

    }


    private void modificar(Contacto contacto, Agenda agenda) {

        selection = menuMaker("", new String[]{"modificar contacto", "eliminar contacto", "volver al menu pincipal"});

        switch (selection) {
            case 1:
                agenda.Modificar(contacto);
                break;
            case 2:
                agenda.eliminarContacto(contacto);
            case 3:
                mostrar(agenda);
        }
    }


    private Contacto buscar(Agenda agenda) {

        selection = menuMaker("", new String[]{"Buscar por nombre", "buscar numero de telefono"});

        switch (selection) {
            case 1:
                return agenda.buscarContacto(askFor("nombre", false));
            case 2:
                return agenda.buscarContacto(askFor("telefono", true));
            default:
                System.out.print("no se encontro el contacto");
        }

        return null;
    }


    public void mostrar(Agenda agenda) {
        selection = menuMaker("bienvenido al menu principal, realice su seleccion", new String[]{"mostrar conactos", "nuevo contacto", "buscar contacto"});

        switch (selection) {
            case 1:
                agenda.mostrarContactos();
                break;
            case 2:
                agenda.agregarContacto();
                break;
            case 3:
                modificar(buscar(agenda), agenda);
                break;
        }
        mostrar(agenda);
    }
}
