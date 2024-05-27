package com.exercises.functional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        //1. Crear una lista de enteros
        List<Integer> numeros = crearLista();
        //2. Quedarme solo con los pares
        //3. Pasar cada numero al cuadrado
        //4. Mostrar cada cuadrado por pantalla
        //5. Obtener la suma de los cuadrados
    }

    private List<Integer> crearLista() {
        //return Arrays.asList(0,1,2,3,5,8,13,21,34,55,89,144);
        return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
    }

}
