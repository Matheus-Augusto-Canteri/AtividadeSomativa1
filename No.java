// Júlia de Lima Becher, Matheus Canteri, Eduarda de Campos e Lorenzzo Deboni

public class No {
    private Integer informacao;
    private No proximo;

    public No(int info) { 
        this.informacao = info;
        this.proximo = null;
    }

    public void setInfo(Integer informacao) {
        this.informacao = informacao;
    }

    public void setProx(No proximo) {
        this.proximo = proximo;
    }

    public No getProx() {
        return this.proximo;
    }

    public Integer getInfo() {
        return this.informacao;
    }

}