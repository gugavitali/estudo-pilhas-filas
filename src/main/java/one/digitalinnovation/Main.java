package one.digitalinnovation;

import one.digitalinnovation.model.filas.Fila;
import one.digitalinnovation.model.filas.NoFila;
import one.digitalinnovation.model.pilhas.NoPilha;
import one.digitalinnovation.model.pilhas.Pilha;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("último");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
