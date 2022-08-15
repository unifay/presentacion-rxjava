package com.example.presentation.rxjavapresentation.demo1;

import com.example.presentation.rxjavapresentation.demo1.observable.Observable;
import com.example.presentation.rxjavapresentation.demo1.observadores.BinaryObservador;
import com.example.presentation.rxjavapresentation.demo1.observadores.HexaObservador;
import com.example.presentation.rxjavapresentation.demo1.observadores.OctalObservador;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ObserverPatternInfiniteDemo {

    public static void main(String[] args) throws InterruptedException {

        // Se instancia un Observable
        Observable observable = new Observable();

        // Se instancian los observadores pasandole el observable
        new HexaObservador(observable);
        new OctalObservador(observable);
        new BinaryObservador(observable);

        // Se comienzan los cambios de estados
        AtomicInteger atomicInteger = new AtomicInteger(0);
        while (true) {
            int randomNumber = new Random().nextInt(100);
            System.out.println("---------------------Observable emitido #"+atomicInteger.getAndIncrement()+"---------------------");
            System.out.println("Cambio de estado a: " + randomNumber);
            observable.setEstado(randomNumber);
            Thread.sleep(3000);
        }
    }
}