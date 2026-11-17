package br.com.unifil.atividadedesignpatterns.Structural_Decorator;

public class SmsDecorator extends NotifierDecorator {
    public SmsDecorator(Notifier notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        notificador.enviarNotificacao(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
