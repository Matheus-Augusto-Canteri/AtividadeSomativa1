public class Lista {

    private No primeiro;

    public Lista() {
        primeiro = null;
    }

    public boolean vazia() {
            return primeiro == null;
    }

    public void inserePrimeiro(int info) {
        No noAuxiliar = new No();
        noAuxiliar.setInfo(info);
        noAuxiliar.setProx(primeiro);
        primeiro = noAuxiliar;
        System.out.println("O número " + info + " foi inserido no início da lista.");
    }

    public void insereUltimo(int info) {
        if (vazia() == true) {
            inserePrimeiro(info);
        } else {
            No auxiliar = primeiro;
            while (auxiliar != null && auxiliar.getProx() != null) {
                auxiliar = auxiliar.getProx();
            }

            if(auxiliar.getProx() == null){
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
                System.out.println("O número " + info + " foi inserido no final da lista.");
            }

        }

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

    }


}