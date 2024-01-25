package EstruturaDeDados.Vetores.teste;

import EstruturaDeDados.Vetores.Vetor;

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

        testeInserirElementoQualquerPosicao();


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
}
