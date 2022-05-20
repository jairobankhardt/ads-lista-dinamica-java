public class Lista {

    private No primeiro;

    public Lista() {
        this.primeiro = null;
    }

    /**
     * Verifica se a lista está vazia
     * 
     * @return void
     */
    private boolean vazia() {
        return this.primeiro == null;
    }

    /**
     * Busca o objeto No que contém o valor passado como parâmetro
     * 
     * @param valor - informação do nó (int)
     * @return No
     */
    public No buscaNo(int valor) {
        if (!this.vazia()) {
            No auxiliar = this.primeiro;
            while (auxiliar != null && auxiliar.getInfo() != valor) {
                auxiliar = auxiliar.getProx();
            }
            if (auxiliar != null) {
                return auxiliar;
            } else {
                System.out.println("Nó com o valor " + valor + " não encontrado.");
            }
        } else {
            System.out.println("*** Lista Vazia ***");
        }
        return null;
    }

    /**
     * Insere um nó no início da lista
     * 
     * @param info - int
     */
    public void inserePrimeiro(int info) {
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(this.primeiro);
        this.primeiro = auxiliar;
    }

    /**
     * Insere um nó no fim da lista
     * 
     * @param info - int
     */
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

    /**
     * Insere um novo nó depois do nó passado como parâmetro
     * 
     * @param no   - nó que deve ficar antes do novo nó (No)
     * @param info - valor do novo nó (int)
     */
    public void insereDepois(No no, int info) {
        if (!this.vazia() && no != null) {
            No novoNo = new No();
            novoNo.setInfo(info);
            novoNo.setProx(no.getProx());
            no.setProx(novoNo);

        }
    }

    /**
     * Remove o primeiro nó
     */
    public void removePrimeiro() {
        if (!this.vazia()) {
            this.primeiro = primeiro.getProx();
        } else {
            System.out.println("*** Lista Vazia ***");
        }
    }

    /**
     * Remove o último nó
     */
    public void removeUltimo() {
        if (!this.vazia()) {
            if (this.primeiro.getProx() == null) {
                this.removePrimeiro();
            } else {
                No auxiliar = this.primeiro;
                while (auxiliar.getProx().getProx() != null) {
                    auxiliar = auxiliar.getProx();
                }
                auxiliar.setProx(null);
            }
        } else {
            System.out.println("*** Lista Vazia ***");
        }
    }

    /**
     * Removo o nó passado como parâmetro
     * 
     * @param no - nó que deve ser excluído (No)
     */
    public void remove(No no) {
        if (!this.vazia() && no != null) {
            if (this.primeiro.getProx() == null && this.primeiro == no) {
                this.removePrimeiro();
            } else {
                No auxiliar = this.primeiro;
                boolean achou = false;
                while (auxiliar.getProx() != null && !achou) {
                    if (auxiliar.getProx() == no) {
                        achou = true;
                    } else {
                        auxiliar = auxiliar.getProx();
                    }
                }
                auxiliar.setProx(auxiliar.getProx().getProx());
            }
        }
    }

    /**
     * Exibe os valores da lista
     */
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
