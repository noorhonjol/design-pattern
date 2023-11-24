package Subjects.Concrete;

import Subjects.EventManger.IEventManger;
import Subjects.Component.WeatherDataSubject;

public class NormalWeatherData extends WeatherDataSubject {

    public NormalWeatherData(Double temperature, Double humidity, IEventManger eventManger){
        super(temperature,humidity,eventManger);

    }

    @Override
    public void printWeatherInfo() {
        System.out.println("the humidity is: "+getHumidity());
        System.out.println("the temperature is: "+getTemperature());
    }

}