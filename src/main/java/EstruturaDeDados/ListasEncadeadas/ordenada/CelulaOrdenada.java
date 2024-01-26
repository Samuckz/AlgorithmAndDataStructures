package EstruturaDeDados.ListasEncadeadas.ordenada;

import EstruturaDeDados.ListasEncadeadas.naoOrdenada.Celula;

public class CelulaOrdenada {
    private int elemento;
    private CelulaOrdenada proximo;

    public CelulaOrdenada(int elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public CelulaOrdenada(int elemento, CelulaOrdenada proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public CelulaOrdenada getProximo() {
        return proximo;
    }

    public void setProximo(CelulaOrdenada proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Celula{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
