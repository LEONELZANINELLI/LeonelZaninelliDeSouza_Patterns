package br.com.unifil.atividadedesignpatterns.Structural_Decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
