package one.digitalinnovation;

public class Main {
    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        //retirando primeiro no da fila
        System.out.println(minhaFila.denqueue());

        System.out.println(minhaFila);

        //adicionando um no no final da fila
        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);

        // retornando primeiro no da fila sem retirá-lo da fila
        System.out.println(minhaFila.first());


    }
}
