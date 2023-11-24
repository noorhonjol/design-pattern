package Subjects.ConcreteDecorator;

import Subjects.Component.WeatherDataSubject;
import Subjects.Decorator.WeatherDataDecorator;

public class PrecipitationDecorator extends WeatherDataDecorator {
    private String precipitation;
    public PrecipitationDecorator(WeatherDataSubject decoratedWeatherData, String precipitation) {
        super(decoratedWeatherData);
        this.precipitation=precipitation;
    }
    public String getPrecipitation() {
        return precipitation;
    }
    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
        decoratedWeatherData.getEventManger().notifyObservers(precipitation,"precipitation");
    }

    @Override
    public void printWeatherInfo() {
        decoratedWeatherData.printWeatherInfo();
        System.out.println("the weather precipitation is : "+precipitation);
    }
}