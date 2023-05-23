public class No {
    private Integer informarcao;
    private No proximo;

    public No(int info) { 
        this.informarcao = info;
        this.proximo = null;
    }

    public void setInfo(Integer informarcao) {
        this.informarcao = informarcao;
    }

    public void setProx(No proximo) {
        this.proximo = proximo;
    }

    public No getProx() {
        return this.proximo;
    }

    public Integer getInfo() {
        return this.informarcao;
    }

}