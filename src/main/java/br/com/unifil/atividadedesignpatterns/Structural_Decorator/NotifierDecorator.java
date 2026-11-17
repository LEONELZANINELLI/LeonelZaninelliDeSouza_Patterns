package br.com.unifil.atividadedesignpatterns.Structural_Decorator;

public abstract class NotifierDecorator implements Notifier {
    protected final Notifier notificador;

    public NotifierDecorator(Notifier notificador) {
        this.notificador = notificador;
    }
    @Override
    public void enviarNotificacao(String mensagem) {
        notificador.enviarNotificacao(mensagem);
    }
}
