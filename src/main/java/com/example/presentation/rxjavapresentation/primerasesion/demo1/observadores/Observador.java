package com.example.presentation.rxjavapresentation.primerasesion.demo1.observadores;

import com.example.presentation.rxjavapresentation.primerasesion.demo1.observable.Observable;

public abstract class Observador {
    protected Observable observable;

    public abstract void actualizar();
}
