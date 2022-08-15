package com.example.presentation.rxjavapresentation.demo1.observadores;

import com.example.presentation.rxjavapresentation.demo1.observable.Observable;

public class BinaryObservador extends Observador {
    public BinaryObservador(Observable observable) {
        this.observable = observable;
        this.observable.inscribir(this);
    }

    @Override
    public void actualizar() {
        System.out.println("Binary String: " + Integer.toBinaryString(observable.getEstado()));
    }
}