public class Lista {

    private No primeiro;

    public Lista() {
        primeiro = null;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public void inserePrimeiro(int info) {
        No noAuxiliar = new No(info);
        noAuxiliar.setInfo(info);
        noAuxiliar.setProx(primeiro);
        primeiro = noAuxiliar;
        System.out.println("\nO número " + info + " foi inserido no início da lista.");
    }

    public void insereDepois(No no, int info) {
        if (no == null || info == 0) {
            System.out.println("Não é possível enviar um nó nulo!");
            return;
        }

        No noAuxiliar = new No(info);
        noAuxiliar.setProx(no.getProx());
        no.setProx(noAuxiliar);

        System.out.println("\nO número " + info + " inserido após o nó " + no.getInfo() + ".");
    }

    public void insereUltimo(int info) {
        if (vazia() == true) {
            inserePrimeiro(info);
        } else {
            No auxiliar = primeiro;
            while (auxiliar != null && auxiliar.getProx() != null) {
                auxiliar = auxiliar.getProx();
            }

            if (auxiliar.getProx() == null) {
                No novo = new No(info);
                novo.setInfo(info);
                auxiliar.setProx(novo);
                System.out.println("\nO número " + info + " foi inserido no final da lista.");
            }

        }

    }

    public void remove(int info) {
        if (info == 0) {
            System.out.println("Não é possível remover um nó que não existe!");
            return;
        }

        No noAuxiliar = primeiro;
        No primeiro = null;

        while (noAuxiliar != null && noAuxiliar.getInfo() != info) {
            primeiro = noAuxiliar;
            noAuxiliar = noAuxiliar.getProx();
        }

        if (noAuxiliar != null) {
            primeiro.setProx(noAuxiliar.getProx());
        }

        System.out.println("\nO nó " + info + " foi removido da lista.");
    }

    public void removeUltimo() {
        if (vazia()) {
            System.out.println("A lista está vazia");
            return;
        }

        if (primeiro.getProx() == null) {
            primeiro = null;
            return;
        }

        No auxiliar = primeiro;

        while (auxiliar.getProx().getProx() != null) {
            auxiliar = auxiliar.getProx();
        }

        System.out.println("O último nó foi removido da lista.");
        auxiliar.setProx(null);
    }

    public void mostrar() {
        if (vazia()) {
            System.out.println("A lista está vazia");
            return;
        }

        No auxiliar = primeiro;
        System.out.println("\n--- Exibindo Lista ---");
        while (auxiliar != null) {
            System.out.print(auxiliar.getInfo() + " ");
            auxiliar = auxiliar.getProx();
        }

        System.out.println("\n----------------------");
    }


    public No getPrimeiro() {
        return primeiro;
    }

}