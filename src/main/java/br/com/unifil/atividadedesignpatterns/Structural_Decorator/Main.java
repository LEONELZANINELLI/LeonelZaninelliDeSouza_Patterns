package br.com.unifil.atividadedesignpatterns.Structural_Decorator;

public class Main {
    public static void main(String[] args) {

        //Apenas email
        Notifier n1 = new EmailNotifier();
        n1.enviarNotificacao("Olá");

        //Email + Slack
        Notifier n2 = new SlackDecorator(new EmailNotifier());
        n2.enviarNotificacao("Promoção");

        //Email + Slack + SMS
        Notifier n3 = new SlackDecorator(new SmsDecorator(new EmailNotifier()));
        n3.enviarNotificacao("Sistema fora");
    }
}
