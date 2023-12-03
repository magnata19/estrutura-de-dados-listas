package one.digitalinnovation;

public class Main {
    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");




        System.out.println(minhaFila);

        //retirando primeiro no da fila
        System.out.println(minhaFila.denqueue());

        System.out.println(minhaFila);

        //adicionando um no no final da fila
        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        // retornando primeiro no da fila sem retirá-lo da fila
        System.out.println(minhaFila.first());


    }
}
