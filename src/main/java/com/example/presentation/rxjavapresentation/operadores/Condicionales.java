package com.example.presentation.rxjavapresentation.operadores;

import io.reactivex.Observable;

//defaultIfEmpty
public class Condicionales {
    public static void main(String[] args) {
        final StringBuilder result = new StringBuilder();
        Observable.empty().defaultIfEmpty("No Data").subscribe(s -> result.append(s));
        System.out.println(result);
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result1 = new StringBuilder();
        Observable.fromArray(letters).firstElement().defaultIfEmpty("No data").subscribe(s -> result1.append(s));
        System.out.println(result1);
    }
}