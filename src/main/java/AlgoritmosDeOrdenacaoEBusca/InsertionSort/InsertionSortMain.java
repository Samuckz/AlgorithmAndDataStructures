package AlgoritmosDeOrdenacaoEBusca.InsertionSort;

import java.util.Random;

public class InsertionSortMain {
    public static void main(String[] args) {
        int sequencia[] = new int[5];
        Random random = new Random();
        for(int i = 0; i < sequencia.length; i++){
            sequencia[i] = random.nextInt(10);
        }

        for(int i = 1; i <=4; i++){
            int aux = sequencia[i];
            int  j = i-1;
            while(j >= 0 && sequencia[j] > aux ){
                sequencia[j+1] = sequencia[j];
                j = j-1;
            }
            sequencia[j+1] = aux;
        }

        System.out.println(toString(sequencia));

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
