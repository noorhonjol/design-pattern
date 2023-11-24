package Subjects.ConcreteDecorator;

import Subjects.Component.WeatherDataSubject;
import Subjects.Decorator.WeatherDataDecorator;

public class WindSpeedDecorator extends WeatherDataDecorator {
    private double windSpeed;
    public WindSpeedDecorator(WeatherDataSubject decoratedWeatherData, double windSpeed) {
        super(decoratedWeatherData);
        this.windSpeed=windSpeed;
    }
    public double getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
        decoratedWeatherData.getEventManger().notifyObservers(windSpeed.toString(),"wind speed");
    }


    @Override
    public void printWeatherInfo() {
        decoratedWeatherData.printWeatherInfo();
        System.out.println("the wind speed is : "+windSpeed);
    }
}