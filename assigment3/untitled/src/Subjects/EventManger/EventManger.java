package Subjects.EventManger;

import Observers.WeatherDataObserver;

import java.util.HashSet;

public class EventManger implements IEventManger  {
    private final HashSet<WeatherDataObserver> observers;
    public EventManger() {
        this.observers = new HashSet<>();
    }

    public void addObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }

    public void deleteObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String val,String type) {
        for (WeatherDataObserver observer:observers){
            observer.update(val,type);
        }
    }
}