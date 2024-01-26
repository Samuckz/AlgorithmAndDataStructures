package AlgoritmosDeOrdenacaoEBusca.BubbleSort;

import EstruturaDeDados.ListasEncadeadas.naoOrdenada.Celula;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int sequencia[] = new int[5];
        Random random = new Random();
        for(int i = 0; i < sequencia.length; i++){
            sequencia[i] = random.nextInt(10);
        }


        System.out.println("Vetor inicial");
        System.out.println(toString(sequencia));

        int[] bubbleSort = bubbleSortMelhorado1(sequencia);

        System.out.println("Vetor BubbleSort");
        System.out.println(toString(bubbleSort));

    }

    public static int[] bubbleSort(int sequencia[]){ // O(N²)
        int aux;
        for(int i = 0; i < sequencia.length; i++){
            for(int j = 0; j < sequencia.length-1; j++){
                if(sequencia[j] > sequencia[j+1]){
                    aux = sequencia[j];
                    sequencia[j] = sequencia[j+1];
                    sequencia[j+1] = aux;
                }
            }
        }

        return sequencia;
    }

    public static int[] bubbleSortMelhorado1(int sequencia[]){
        int aux;
        for(int i =1; i <= 4; i++){
            for (int j = 4 ; j >= i; j-- ){
                if(sequencia[j] < sequencia[j-1]){
                    aux = sequencia[j];
                    sequencia[j] = sequencia[j-1];
                    sequencia[j-1] = aux;
                }
            }
        }

        return sequencia;
    }


    public static String toString(int sequencia[]){
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for(int i = 0; i < sequencia.length-1; i++){
            builder.append(sequencia[i]).append(",");
        }
        builder.append(sequencia[(sequencia.length)-1]).append("]");
        return builder.toString();
    }
}
