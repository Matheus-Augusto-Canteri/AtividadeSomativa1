// Júlia de Lima Becher, Matheus Canteri, Eduarda de Campos e Lorenzzo Deboni

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.insereUltimo(10);
        lista.insereUltimo(20);
        lista.insereUltimo(30);

        lista.mostrar();

        No no1 = lista.getPrimeiro().getProx();

        lista.insereDepois(no1, 100);

        lista.mostrar();

        lista.inserePrimeiro(50);

        lista.mostrar();

        lista.insereUltimo(200);

        lista.mostrar();

        lista.remove(10);

        lista.mostrar();

        lista.removePrimeiro();

        lista.mostrar();

        lista.removeUltimo();

        lista.mostrar();
        }
    }