package Subjects.Component;

import Subjects.EventManger.IEventManger;

public abstract class WeatherDataSubject  {
    private final IEventManger eventManger;
    private Double temperature;
    private Double humidity ;
    protected WeatherDataSubject(Double temperature,Double humidity,IEventManger eventManger) {
        this.eventManger = eventManger;
        this.temperature=temperature;
        this.humidity = humidity;
    }
    public IEventManger getEventManger(){

        return eventManger;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        eventManger.notifyObservers(temperature.toString(),"temperature");
    }

    public void setHumidity(Double humidity) {
        this.humidity=humidity;
        eventManger.notifyObservers(humidity.toString(),"humidity");
    }
    public Double getTemperature() {
        return temperature;
    }
    public Double getHumidity() {
        return humidity;
    }
    public abstract void printWeatherInfo();

}