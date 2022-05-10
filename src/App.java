public class App {
    public static void main(String[] args) throws Exception {

        Lista lista = new Lista();

        lista.insereUltimo(10);
        lista.insereUltimo(20);
        lista.insereUltimo(30);

        lista.inserePrimeiro(50);

        lista.insereUltimo(5);

        lista.retirarPrimeiro();

        lista.retirarUltimo();
        lista.retirarUltimo();
        lista.retirarPrimeiro();
        lista.retirarUltimo();

        lista.mostrar();
    }
}
