package ListasEncadeadas;

public class ListaEncadeada<T>{
    private Celula<T> inicio;
    private Celula<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento){
        Celula<T> celula = new Celula<T>(elemento);
        if(getTamanho() == 0){
            this.inicio = celula;
        } else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

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

        Celula<T> atual = this.inicio;

        for(int i = 0; i < this.tamanho-1; i++){
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento());
        return builder.toString();
    }

    public void imprime(){
        Celula<T> atual = this.inicio;
        do{
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }while (atual.getProximo() != null);

        System.out.println(atual.getElemento());
    }
}
