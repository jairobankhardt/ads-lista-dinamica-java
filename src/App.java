/**
 * Pontifícia Universidade Católica do Paraná
 * Escola Politécnica
 * 
 * Métodos de Pesquisa e Ordenação em Estruturas de Dados
 * Professor Fellipe Medeiros Veiga
 * 
 * Tecnologia em Análise e Desenvolvimento de Sistemas
 * Alunos: Fernando Antunes e Jairo Moisés Stuehler Bankhardt
 * 
 * Gestão de Tecnologia da Informação
 * Aluno: Eduardo Luan da Rosa
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("**********************************");
        System.out.println("***** LISTA DINÂMICA EM JAVA *****");
        System.out.println("**********************************");
        System.out.println("\n\n");

        Lista lista = new Lista();

        System.out.println("--- Lista recém criada ---");
        lista.mostrar();

        System.out.println("\n\n--- Insere alguns dados ---");
        lista.insereUltimo(20);
        lista.insereUltimo(30);
        lista.insereUltimo(50);
        lista.inserePrimeiro(10);
        lista.mostrar();

        System.out.println("\n\n--- Insere 40 depois do nó de valor 30 ---");
        lista.insereDepois(lista.buscaNo(30), 40);
        lista.mostrar();

        System.out.println("\n\n--- Tenta inserir depois de um nó que não existe ---");
        lista.insereDepois(lista.buscaNo(35), 45);
        lista.mostrar();

        System.out.println("\n\n--- Remove o primeiro nó ---");
        lista.removePrimeiro();
        lista.mostrar();

        System.out.println("\n\n--- Remove o último nó ---");
        lista.removeUltimo();
        lista.mostrar();

        System.out.println("\n\n--- Remove o nó de valor 30 ---");
        lista.remove(lista.buscaNo(30));
        lista.mostrar();

        System.out.println("\n\n--- Tenta remover um nó que não existe ---");
        lista.remove(lista.buscaNo(60));
        lista.mostrar();

        System.out.println("\n\nFIM DO PROGRAMA\nOBRIGADO");
    }
}
