package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        System.out.println(queueCarros.add(new Carro("Renault")));
        System.out.println(queueCarros.offer(new Carro("Peugeot")));

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Carro("Ford"));
        listaDeCarros.add(new Carro("Fiat"));
        listaDeCarros.add(new Carro("Renault"));

        System.out.println(listaDeCarros.contains(new Carro("Ford")));

        System.out.println(listaDeCarros.get(2));

        System.out.println(listaDeCarros.indexOf(new Carro("Fiat")));

        System.out.println(listaDeCarros.remove(2));

        System.out.println(listaDeCarros);






    }
}