package com.sofka;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        Agenda agenda = new Agenda();

        var menu = new Menuprincipal();
        menu.mostrar(agenda);
    }
}
