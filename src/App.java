/*
Pontifícia Universidade Católica do Paraná

Escola Politécnica

Tecnologia em Análise e Desenvolvimento de Sistemas

Métodos de Pesquisa e Ordenação em Estruturas de Dados

Professor Fellipe Medeiros Veiga

Alunos: Jairo Moisés Stuehler Bankhardt
        Eduardo Luan da Rosa
        Fernando Antunes
*/

public class App {
    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();

        lista.mostrar();

        System.out.println("--- 1 ---");
        lista.insereUltimo(20);
        lista.insereUltimo(30);
        lista.insereUltimo(50);
        lista.inserePrimeiro(10);
        lista.insereDepois(30, 40);
        lista.insereDepois(35, 45);
        lista.mostrar();

        System.out.println("\n--- 2 ---");
        lista.removePrimeiro();
        lista.removeUltimo();
        lista.remove(30);
        lista.mostrar();
    }
}
