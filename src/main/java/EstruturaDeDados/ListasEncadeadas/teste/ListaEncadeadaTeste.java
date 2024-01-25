package EstruturaDeDados.ListasEncadeadas.teste;

import EstruturaDeDados.ListasEncadeadas.ListaEncadeada;
import EstruturaDeDados.Vetores.Vetor;

import java.util.LinkedList;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
//        test_adicionaNoInicio();
//        test_adicionaPorPosicao();
//        test_removerPrimeiroEUltimoElemento();
//        test_removeElementoPorPosicao();
        testeLinkedList();
    }

    public static ListaEncadeada<Integer> cenario(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona( 2);
        lista.adiciona( 3);
        lista.adiciona( 4);// 1,2,3,4

        return lista;
    }

    public static void test_adicionaNoInicio(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaNoInicio(3);
        lista.adicionaNoInicio(2);
        lista.adicionaNoInicio(1); //1, 2, 3
        System.out.println(lista);
    }

    public static void test_adicionaPorPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona( 2);
        lista.adiciona( 4);// 1,2,4
        lista.adiciona(0, 0);// 0, 1, 2, 4
        lista.adiciona(4, 5); // 0, 1 2 4 5
        lista.adiciona(2  , 3); // 0, 1 2 3 4 5

        System.out.println(lista);
    }

    public static void test_removerPrimeiroEUltimoElemento(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona( 2);
        lista.adiciona( 3);
        lista.adiciona( 4);// 1,2,3,4

        System.out.println("Lista inicial:");
        System.out.println(lista);

        lista.deletarPrimeiroElemento();

        System.out.println("\nRemovido Primeiro elemento:");
        System.out.println(lista + "[" + lista.getTamanho() + "]");

        lista.deletarUltimoElemento();

        System.out.println("\nRemovido Último elemento:");
        System.out.println(lista + "[" + lista.getTamanho() + "]");

        lista.deletarUltimoElemento();

        System.out.println("\nRemovido Último elemento:");
        System.out.println(lista + "[" + lista.getTamanho() + "]");

        lista.deletarUltimoElemento();

        System.out.println("\nRemovido Último elemento:");
        System.out.println(lista + "[" + lista.getTamanho() + "]");
    }

    public static void test_removeElementoPorPosicao(){
        ListaEncadeada<Integer> lista = cenario();

        System.out.println("Lista original");
        System.out.println(lista);

        lista.deletarElementoPosicaoQualquer(2);

        System.out.println("Lista alterada");
        System.out.println(lista);

        lista.deletarElementoPosicaoQualquer(2);

        System.out.println("Lista alterada");
        System.out.println(lista);
    }


    public static void testesIniciais(){
        ListaEncadeada lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);

//        System.out.println("Tamanho = " + lista.getTamanho());
//        System.out.println(lista.toString());

        lista.adiciona(2);
//        System.out.println(lista);

        lista.adiciona(3);
//        System.out.println(lista);

        System.out.println(lista);

        //busca por elemento
        System.out.println("Busca por elementos");
        System.out.println(lista.buscaPorElemento(1));
        System.out.println(lista.buscaPorElemento(2));
        System.out.println(lista.buscaPorElemento(3));
        System.out.println(lista.buscaPorElemento(0));

        //busca por posicao
        System.out.println("Busca por posicao");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(-1));


        lista.clearList();
        System.out.println(lista);
    }

    public static void testeLinkedList(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);
        lista.add(2,2);

        System.out.println(lista);
    }

}
