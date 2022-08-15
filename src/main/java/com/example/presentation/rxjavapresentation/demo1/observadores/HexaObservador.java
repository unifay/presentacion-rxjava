package com.example.presentation.rxjavapresentation.demo1.observadores;

import com.example.presentation.rxjavapresentation.demo1.observable.Observable;

public class HexaObservador extends Observador {
    public HexaObservador(Observable observable) {
        this.observable = observable;
        this.observable.inscribir(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Hex String: " + Integer.toHexString(observable.getEstado()).toUpperCase());
    }
}