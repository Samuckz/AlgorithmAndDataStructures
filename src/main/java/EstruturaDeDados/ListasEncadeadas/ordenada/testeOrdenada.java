package EstruturaDeDados.ListasEncadeadas.ordenada;

public class testeOrdenada {
    public static void main(String[] args) {
        testeInserirElemento();
    }

    public static void testeInserirElemento(){
        ListaEncadeadaOrdenada lista = new ListaEncadeadaOrdenada();
        lista.inserirNaLista(5);
        lista.inserirNaLista(2);
        lista.inserirNaLista(8);
        lista.inserirNaLista(6);
        lista.inserirNaLista(12);
        System.out.println(lista);

        lista.removerDaLista(8);
        System.out.println(lista);
        lista.removerDaLista(5);
        System.out.println(lista);

        lista.esvaziarLista();
        System.out.println(lista);

    }
}
