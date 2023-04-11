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

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));

        System.out.println(treeSetCarros);

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3a");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Média", "8.9");
        aluno2.put("Turma", "3b");

        System.out.println();

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
        System.out.println(aluno.containsKey("Nome2"));
    }
}