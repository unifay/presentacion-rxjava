package com.example.presentation.rxjavapresentation.operadores;

import io.reactivex.Observable;

//map
public class Transformacion {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable = Observable.fromArray(letters);
        observable.map(String::toUpperCase).subscribe(letter -> result.append(letter));
        System.out.println(result);
    }
}