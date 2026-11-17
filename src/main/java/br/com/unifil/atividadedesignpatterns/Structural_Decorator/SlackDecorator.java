package br.com.unifil.atividadedesignpatterns.Structural_Decorator;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        notificador.enviarNotificacao(mensagem);
        System.out.println("Enviando Slack: " + mensagem);
    }

}
