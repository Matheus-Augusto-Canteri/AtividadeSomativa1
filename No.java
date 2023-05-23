public class No {
    private Integer informarcao;
    private No proximo;

    public No() {
        informarcao = null;
        proximo = null;
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