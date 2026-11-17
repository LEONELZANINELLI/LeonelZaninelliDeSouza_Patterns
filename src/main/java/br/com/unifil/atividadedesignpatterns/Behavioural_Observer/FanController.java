package br.com.unifil.atividadedesignpatterns.Behavioural_Observer;

public class FanController implements TemperatureObserver {
    @Override
    public void onTemperatureChanged(double temp) {
        if (temp > 28) {
            System.out.println("Ventilador: LIGAR");
        } else {
            System.out.println("Ventilador: DESLIGAR");
        }
    }
}