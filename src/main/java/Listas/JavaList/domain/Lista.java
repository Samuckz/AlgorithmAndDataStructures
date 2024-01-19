package Listas.JavaList.domain;

import java.util.List;

public class Lista {
    private List<Item> itens;
    private Integer first;
    private Integer last;


    public Lista(List<Item> itens) {
        this.itens = itens;
        this.first = 1;
        this.last = this.first;
    }

    public Lista(){

    }



    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    // === METHODS ===

    public Lista startList(List<Item> itens){
        return new Lista(itens);
    }

    public boolean verificaListaVazia(){
        return this.itens.isEmpty();
    }

    public void imprimeLista(){
        for(Item item: itens){
            System.out.println(String.format("%s[%d]", item.toString(), itens.indexOf(item)));
        }
    }

    public void insereItem(Item item, Integer maxSize){
        if(this.last > maxSize){
            System.out.println("Lista já está cheia!");
            return;
        }
        else{
            itens.add(item);
            last++;

            System.out.println("Item inserido com sucesso!");
        }
    }

    public void removeItem(Item item, Integer p){
        if(verificaListaVazia() || p > itens.size()){
            System.out.println("Posição de lista inexistente");
        } else {
            itens.remove((int) p);
            last = itens.size();
        }
    }

    public void getDetails(){
        System.out.println(String.format("Number of elements: %d\nFirst Index: %d\nLast Index: %d", itens.size(), first, last));
    }
}
