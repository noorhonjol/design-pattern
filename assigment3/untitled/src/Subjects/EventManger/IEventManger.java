package Subjects.EventManger;

import Observers.WeatherDataObserver;

public interface IEventManger {
    void addObserver(WeatherDataObserver observer);
    void deleteObserver(WeatherDataObserver observer);
    void notifyObservers(String val,String type);
}
