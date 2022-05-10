public class Lista {

    private No primeiro;

    public Lista() {
        this.primeiro = null;
    }

    private boolean vazia() {
        return this.primeiro == null;
    }

    public void inserePrimeiro(int info) {
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(this.primeiro);
        this.primeiro = auxiliar;
    }

    public void insereUltimo(int info) {
        if (this.vazia() == true) {
            this.inserePrimeiro(info);
        } else {
            No auxiliar = this.primeiro;
            while ((auxiliar != null) && (auxiliar.getProx() != null)) {
                auxiliar = auxiliar.getProx();
            }

            if (auxiliar.getProx() == null) {
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
            }
        }
    }

    public void retirarPrimeiro() {
        if (!this.vazia()) {
            this.primeiro = primeiro.getProx();
        }
    }

    public void retirarUltimo() {
        if (!this.vazia()) {
            if (this.primeiro.getProx() == null) {
                this.retirarPrimeiro();
            } else {
                No auxiliar = this.primeiro;
                while (auxiliar.getProx().getProx() != null) {
                    auxiliar = auxiliar.getProx();
                }
                auxiliar.setProx(null);
            }
        }
    }

    public void mostrar() {
        if (this.primeiro != null) {
            No auxiliar = this.primeiro;
            while (auxiliar != null) {
                System.out.print(auxiliar.getInfo());
                auxiliar = auxiliar.getProx();
                if (auxiliar != null) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("*** Lista Vazia ***");
        }
    }

}
