// Alto nível depende de abstrações
interface Notificador {
    void enviar(String mensagem);
}

class EmailNotificador implements Notificador {
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}

class Pedido {
    private Notificador notificador;

    public Pedido(Notificador notificador) {
        this.notificador = notificador;
    }

    public void confirmar() {
        notificador.enviar("Pedido confirmado!");
    }
}

public class D_A {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        Pedido pedido = new Pedido(email);
        pedido.confirmar();
    }
}
