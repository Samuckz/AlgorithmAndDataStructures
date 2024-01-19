package Listas.JavaList;

import Listas.JavaList.domain.Item;
import Listas.JavaList.domain.Lista;

import java.util.ArrayList;

public class ListaMain {
    public static void main(String[] args) {
        final Integer MAXTAM = 1000;

        Lista lista = new Lista().startList(new ArrayList<Item>(MAXTAM));

        // Verifica se a lista está vazia
        System.out.println("Lista Vazia? " + lista.verificaListaVazia());

        lista.insereItem(new Item("Item 1"), MAXTAM);
        lista.insereItem(new Item("Item 2"), MAXTAM);
        lista.insereItem(new Item("Item 3"), MAXTAM);

        // Imprime a lista inicial
        System.out.println("Lista Inicial:");
        lista.imprimeLista();

        // Verifica se a lista está vazia
        System.out.println("Lista Vazia? " + lista.verificaListaVazia());

        // Adiciona um novo item à lista
        Item novoItem = new Item("Novo Item");
        lista.insereItem(novoItem, Integer.MAX_VALUE);

        // Imprime a lista após a inserção
        System.out.println("\nLista Após Inserção:");
        lista.imprimeLista();

        // Remove um item da lista
        int posicaoParaRemover = 1; // Substitua pela posição desejada
        lista.removeItem(novoItem, posicaoParaRemover);

        // Imprime a lista após a remoção
        System.out.println("\nLista Após Remoção:");
        lista.imprimeLista();


        // Dados da lista
        System.out.println("\nDados da lista:");
        lista.getDetails();





    }
}
