/**
 * Nós que farão parte da lista
 */
public class No {

    private Integer informacao;
    private No proximo;

    public No() {
        this.informacao = null;
        this.proximo = null;
    }

    public No getProx() {
        return this.proximo;
    }

    public Integer getInfo() {
        return this.informacao;
    }

    public void setInfo(Integer informacao) {
        this.informacao = informacao;
    }

    public void setProx(No proximo) {
        this.proximo = proximo;
    }

}