package EstruturaDeDados.Vetores;

public class VetorObjetos {
    private Object[] elementos;
    private int ultimaPosicao;

    private final int NAO_ENCONTRADO  = -1;


    // === CONSTRUCTORS ===
    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.ultimaPosicao = 0;
    }

    // === METHODS ===
    public int getUltimaPosicao() {
        return ultimaPosicao;
    }

    public int getTamanhoVetor(){
        return this.elementos.length;
    }

    public void adicionaNoFinal(Object elemento) throws RuntimeException{

        this.aumentarCapacidadeVetor();

        if(ultimaPosicao == this.elementos.length ){
            throw new RuntimeException("O vetor já está cheio");
        }

        this.elementos[this.ultimaPosicao] = elemento;
        ultimaPosicao++;
    }
    /*
     * Este método, caso o vetor apresente um tamanho muito grande, pode não se tornar muito efetivo, já que teríamos
     * de percorrer o vetor inteiro de vez por vez. Nesse caso,seria interessante criar uma variável par armazenar a última posição do
     * vetor utilizada
     * */

    public String toString(){
        StringBuilder response = new StringBuilder();
        response.append("[");
        for (int i = 0; i < this.ultimaPosicao-1; i++){
            response.append(this.elementos[i]);
            response.append(",");
        }
        if(this.ultimaPosicao > 0)
            response.append(this.elementos[this.ultimaPosicao-1]);
        response.append("]");

        return response.toString();
    }

    public void imprimeVetor(){
        for (int i = 0; i < elementos.length; i++){
            System.out.println(this.elementos[i]);
        }
    }

    public Object obterElementoPorPosicao(int posicao){
        this.validarPosicao(posicao);
        return this.elementos[posicao];


    }

    public void validarPosicao(int posicao){
        if(posicao < 0 || posicao >= this.ultimaPosicao)
            throw new IllegalArgumentException("Posição inválida");
    }

    public int verificaSeElementoExisteNoVetor(Object elemento){
        for(int i = 0; i < this.ultimaPosicao; i++){
            if(this.elementos[i].equals(elemento))
                return i;
        }

        return NAO_ENCONTRADO;

    }

    public void adicionarElementoEmQualquerPosicao(Object elemento, int posicao){
        this.validarPosicao(posicao);
        this.aumentarCapacidadeVetor();

        Object atual = this.elementos[posicao];
        this.elementos[posicao] = elemento;
        posicao++;

        if(this.ultimaPosicao == this.elementos.length){
            throw new RuntimeException("O vetor já está cheio");
        }

        while(posicao <= this.ultimaPosicao){
            Object proximo = this.elementos[posicao];
            this.elementos[posicao] = atual;
            atual = proximo;
            posicao++;
        }

        this.ultimaPosicao++;
    }

    private void aumentarCapacidadeVetor(){
        if(this.ultimaPosicao == this.elementos.length){
            Object[] elementosNovos = new String[this.elementos.length*2];
            for(int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    public void removerElementoEmQualquerPosicao(int posicao){
        this.validarPosicao(posicao);
        while(posicao < this.ultimaPosicao){
            Object proximo = this.elementos[posicao+1];
            this.elementos[posicao] = proximo;
            posicao++;
        }

        this.ultimaPosicao--;
    }
}
