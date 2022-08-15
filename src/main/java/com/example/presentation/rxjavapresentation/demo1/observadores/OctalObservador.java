package com.example.presentation.rxjavapresentation.demo1.observadores;

import com.example.presentation.rxjavapresentation.demo1.observable.Observable;

public class OctalObservador extends Observador {
    public OctalObservador(Observable observable) {
        this.observable = observable;
        this.observable.inscribir(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Octal String: " + Integer.toOctalString(observable.getEstado()));
    }
}