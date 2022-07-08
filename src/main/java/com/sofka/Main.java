package com.sofka;

public class Main {
    public static void main(String[] args) {
        var menu = new Menuprincipal();

        Agenda agenda = new Agenda();

        menu.mostrar(agenda);
    }
}
