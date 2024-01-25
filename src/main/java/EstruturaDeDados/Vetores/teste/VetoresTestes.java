package EstruturaDeDados.Vetores.teste;

import EstruturaDeDados.Vetores.Contato;
import EstruturaDeDados.Vetores.Vetor;
import EstruturaDeDados.Vetores.VetorObjetos;

public class VetoresTestes {

    public static void main(String[] args) {

//        System.out.println("=== ADICIONA ELEMENTO NO FINAL ===");
//        testeAdicionaFinal();
//
//        System.out.println("=== QUANTIDADE DE ELEMENTOS NO VETOR ===");
//        testeQuantidadeElementosVetor();
//
//        System.out.println("=== OBTER ELEMENTO POR POSIÇÃO ===");
//        testeObterElementoPorPosicao();
//
//        System.out.println("=== ELEMENTO EXISTE ===");
//        testeVerificaSeElementoExiste();

//        testeInserirElementoQualquerPosicao();

//        testeAumentarCapacidadeVetor();

//        testeRemoverElementoEmQualquerPosicao();

        testeVetorObjetos();
    }

    public static Vetor iniciaCenario(){
        Vetor vetor = new Vetor(4);
        vetor.adicionaNoFinal("elemento 1");
        vetor.adicionaNoFinal("elemento 2");
        vetor.adicionaNoFinal("elemento 3");
        return vetor;
    }

    public static void testeAdicionaFinal(){
        Vetor vetor = iniciaCenario();
        System.out.println(vetor.toString());
    }

    public static void testeQuantidadeElementosVetor(){
        Vetor vetor = iniciaCenario();
        System.out.println(vetor.getUltimaPosicao());
    }

    public static void testeObterElementoPorPosicao(){
        Vetor vetor = iniciaCenario();
        System.out.println(vetor.obterElementoPorPosicao(2));
//        vetor.obterElementoPorPosicao(-1);
//        vetor.obterElementoPorPosicao(7);

    }

    public static void testeVerificaSeElementoExiste(){
        Vetor vetor = iniciaCenario();
        System.out.println(vetor.verificaSeElementoExisteNoVetor("elemento 2"));
        System.out.println(vetor.verificaSeElementoExisteNoVetor("elemento 4"));

    }

    public static void testeInserirElementoQualquerPosicao(){
        Vetor vetor = new Vetor(10);
        vetor.adicionaNoFinal("B");
        vetor.adicionaNoFinal("C");
        vetor.adicionaNoFinal("D");
        vetor.adicionaNoFinal("E");
        vetor.adicionaNoFinal("F");
        vetor.adicionaNoFinal("G");
        System.out.println("Vetor inicial");
        System.out.println(vetor.toString());
        vetor.adicionarElementoEmQualquerPosicao("A", 0);
        System.out.println("Vetor Alterado");
        System.out.println(vetor.toString());
        System.out.println(vetor.getTamanhoVetor());
        System.out.println(vetor.getUltimaPosicao());
    }

    private static void testeAumentarCapacidadeVetor(){
        Vetor vetor = new Vetor(3);
        System.out.println(vetor.getTamanhoVetor());
        vetor.adicionaNoFinal("B");
        vetor.adicionaNoFinal("C");
        vetor.adicionaNoFinal("D");
        vetor.adicionaNoFinal("E");
        vetor.adicionaNoFinal("F");
        vetor.adicionaNoFinal("G");
        System.out.println(vetor);
        System.out.println(vetor.getTamanhoVetor());
    }

    public static void testeRemoverElementoEmQualquerPosicao(){
        Vetor vetor = new Vetor(10);
        System.out.println(vetor.getTamanhoVetor());
        vetor.adicionaNoFinal("B");
        vetor.adicionaNoFinal("G");
        vetor.adicionaNoFinal("C");
        vetor.adicionaNoFinal("D");
        vetor.adicionaNoFinal("E");
        vetor.adicionaNoFinal("F");
        System.out.println(vetor);
        vetor.removerElementoEmQualquerPosicao(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento E");
        int pos= vetor.verificaSeElementoExisteNoVetor("E");

        if(pos != -1)
            vetor.removerElementoEmQualquerPosicao(pos);

        System.out.println(vetor);
    }

    public static void testeVetorObjetos(){
        VetorObjetos vetor = new VetorObjetos(3);
        Contato c1 = new Contato("Contato 1","12345678","contato1@email.com");
        Contato c2 = new Contato("Contato 2","87654321","contato2@email.com");
        Contato c3 = new Contato("Contato 3","14785236","contato3@email.com");

        vetor.adicionaNoFinal(c1);
        vetor.adicionaNoFinal(c2);
        vetor.adicionaNoFinal(c3);

        System.out.println("Tamanho = " + vetor.getTamanhoVetor());

        System.out.println(vetor);
    }
}
