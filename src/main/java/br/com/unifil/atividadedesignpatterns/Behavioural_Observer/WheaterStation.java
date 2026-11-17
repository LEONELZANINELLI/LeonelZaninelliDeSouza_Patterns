package br.com.unifil.atividadedesignpatterns.Behavioural_Observer;

import java.util.ArrayList;
import java.util.List;

public class WheaterStation {

    private final List<TemperatureObserver> observers =  new ArrayList<>();
    private double temperature;

    public void subscribe(TemperatureObserver observer){
        if(observers != null && !observers.contains(observer)){
            observers.add(observer);
        }
    }
    public void unsubscribe(TemperatureObserver observer){
        observers.remove(observer);
    }

    public void setTemperature(double temp){
        this.temperature = temp;
        notifyObservers();
    }

    private void notifyObservers(){
        for(TemperatureObserver observer : observers){
            observer.onTemperatureChanged(temperature);
        }
    }


}
