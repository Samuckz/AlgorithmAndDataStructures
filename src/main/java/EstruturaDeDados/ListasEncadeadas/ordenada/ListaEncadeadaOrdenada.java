package EstruturaDeDados.ListasEncadeadas.ordenada;

import EstruturaDeDados.ListasEncadeadas.naoOrdenada.Celula;

public class ListaEncadeadaOrdenada<Integer> {
    private CelulaOrdenada inicio;
    private CelulaOrdenada ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        // [1,2,3,4]
        StringBuilder builder = new StringBuilder();

        if(getTamanho() == 0){
            return "[]";
        }

        CelulaOrdenada atual = this.inicio;
//        System.out.println(atual);

        for(int i = 0; i < this.tamanho-1; i++){
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento());
        return builder.toString();
    }

    public void inserirNaLista(int elemento){
        CelulaOrdenada celula = new CelulaOrdenada(elemento);
        if(this.getTamanho() == 0){
            this.inicio = celula;
            this.ultimo = celula;
        } else if(this.tamanho == 1){
             if(inicio.getElemento() <= elemento){
                 this.inicio.setProximo(celula);
                 this.ultimo = celula;
             }  else{
                 celula.setProximo(this.ultimo);
                 this.inicio = celula;
             }
        } else if(elemento <= this.inicio.getElemento()){
            celula.setProximo(this.inicio);
            this.inicio = celula;
        } else if(elemento >= this.ultimo.getElemento()){
            this.ultimo.setProximo(celula);
            this.ultimo = celula;
        }

        else {
            CelulaOrdenada atual = this.inicio;


            for(int i = 0; i < this.tamanho; i++){
                CelulaOrdenada proximo = atual.getProximo();
                if(atual.getElemento() < elemento && proximo.getElemento() > elemento){
                    celula.setProximo(proximo);
                    atual.setProximo(celula);
                    break;
                }
                atual = atual.getProximo();
            }
        }

        this.tamanho++;
//        System.out.println(this.inicio.getElemento() + " / " + this.ultimo.getElemento() + " / " + this.tamanho);?
    }

    public boolean verificaListaVazia(){
        return (this.tamanho == 0) ? true : false;
    }

    public boolean verificaExistenciaDeElemento(int elemento){

        if(this.verificaListaVazia())
            throw new RuntimeException("A lista está vazia");

        CelulaOrdenada atual = this.inicio;
        for(int i =0; i < this.tamanho; i++){
            if(atual.getElemento() == elemento)
                return true;
            atual = atual.getProximo();
        }

        return false;
    }

    public void removerDaLista(int elemento){

        if(!this.verificaExistenciaDeElemento(elemento))
            throw new IllegalArgumentException("Elemento não encontrado: " + elemento);

        CelulaOrdenada atual = this.inicio;
        CelulaOrdenada anterior = null;

        while(atual != null){
            if(atual.getElemento() == elemento){
                if(anterior == null){
                    this.inicio = atual.getProximo();
                    this.tamanho--;
                }
                else{
                    anterior.setProximo(atual.getProximo());
                    this.tamanho--;

                }
            }
            anterior = atual;
            atual = atual.getProximo();
        }

    }

    public void consultarLista(){
        CelulaOrdenada atual = this.inicio;
        while(atual.getProximo() != null){
            System.out.println(atual.toString());
        }
    }

    public void esvaziarLista(){
        if(this.verificaListaVazia())
            System.out.println("A lista já está vazia");

        this.inicio = null;
        this.ultimo = null;

        this.tamanho = 0;
    }
}
