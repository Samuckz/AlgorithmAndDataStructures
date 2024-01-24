package ListasEncadeadas;

public class ListaEncadeada<T>{
    private Celula<T> inicio;
    private Celula<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

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

    public void clearList(){
        Celula<T> atual = this.inicio;
        while(atual != null){
            Celula<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private Celula<T> buscaNo(int posicao){

        if(!(posicao >= 0 && posicao <= this.tamanho)){
            throw new IllegalArgumentException("Posição não existe");
        }

        Celula<T> atual = this.inicio;
        for(int i =0; i < posicao; i++){
            atual = atual.getProximo();
        }

        return atual;
    }

    public T buscaPorPosicao(int posicao){
        return this.buscaNo(posicao).getElemento();
    }

    public int buscaPorElemento(T elemento){
        Celula<T> atual = this.inicio;
        int posicao = 0;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }
        return NAO_ENCONTRADO;
    }

    public void adicionaNoInicio(T elemento){
        if(this.tamanho == 0){
            Celula<T> novaCelula = new Celula<>(elemento);
            this.inicio = novaCelula;
            this.ultimo = novaCelula;
        } else{
            Celula<T> novaCelula = new Celula<>(elemento, inicio);
            this.inicio = novaCelula;
        }

        tamanho++;

    }

    public void adiciona(int posicao, T elemento){
        if(posicao == 0){
            this.adicionaNoInicio(elemento);
        }
        else if(posicao == this.tamanho){
            this.adiciona(elemento);
        }
        else if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        } else{
            Celula<T> noAnterior = this.buscaNo(posicao);
            Celula<T> proximoNo = noAnterior.getProximo();
            Celula<T> novaCelula = new Celula<>(elemento, proximoNo);
            noAnterior.setProximo(novaCelula);
            this.tamanho++;
        }
    }

    public void adicionaPosicaoEspecifica(T elemento, int posicao){
        if(posicao == 0)
            adicionaNoInicio(elemento);

        else if (this.tamanho == posicao) {
            adiciona(elemento);
        }

        else if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        else{
            Celula<T> antigaCelula = this.buscaNo(posicao);
            Celula<T> proxinoCelula = antigaCelula.getProximo();
            Celula<T> novaCelula = new Celula<>(elemento, proxinoCelula);
            antigaCelula.setProximo(novaCelula);
            this.tamanho++;
        }
    }

    public void anularElemento(Celula elemento){
        elemento.setElemento(null);
        elemento.setProximo(null);
    }

    public void deletarPrimeiroElemento(){
        if(this.tamanho == 0){
            throw new RuntimeException("A lista está vazia");
        }

        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if(this.tamanho == 0){
            this.ultimo = null;
        }

    }

    public void deletarUltimoElemento(){
        if (this.tamanho==0)
            throw new RuntimeException("A lista está vazia");

        if(this.tamanho == 1){
            this.deletarPrimeiroElemento();
            return;
        }


        Celula<T> penultimoElemento = this.buscaNo(this.tamanho - 2);
        penultimoElemento.setProximo(null);
        this.ultimo = penultimoElemento;
        this.tamanho--;
    }

    public void deletarElementoPosicaoQualquer(int posicao){

        if(posicao < 0 || posicao >= this.tamanho)
            throw new IllegalArgumentException("Posição não existe");

        if(posicao == 0){
            this.deletarPrimeiroElemento();
            return;
        }

        if(posicao == this.tamanho - 1){
            this.deletarUltimoElemento();
            return;
        }

        Celula<T> celulaRemovida = buscaNo(posicao);
        Celula<T> celulaAntecessora = buscaNo(posicao-1);

        celulaAntecessora.setProximo(celulaRemovida.getProximo());
        this.anularElemento(celulaRemovida);
        this.tamanho--;
    }

}
