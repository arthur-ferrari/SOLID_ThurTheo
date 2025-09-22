// Alto nível depende diretamente de baixo nível
class Email {
    public void enviarEmail(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}

class Pedido {
    private Email email = new Email();

    public void confirmar() {
        email.enviarEmail("Pedido confirmado!");
    }
}

public class D_NA {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.confirmar();
    }
}
