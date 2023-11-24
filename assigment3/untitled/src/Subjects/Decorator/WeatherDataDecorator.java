package Subjects.Decorator;

import Subjects.Component.WeatherDataSubject;
import Subjects.EventManger.IEventManger;

public abstract class WeatherDataDecorator extends WeatherDataSubject {
    protected  WeatherDataSubject decoratedWeatherData;

    protected WeatherDataDecorator(WeatherDataSubject decoratedWeatherData) {
        super(decoratedWeatherData.getTemperature(), decoratedWeatherData.getHumidity(), decoratedWeatherData.getEventManger());

        this.decoratedWeatherData=decoratedWeatherData;
    }
    @Override
    public void setTemperature(Double temperature){
        decoratedWeatherData.setTemperature(temperature);
    }
    @Override
    public void setHumidity(Double humidity) {
        decoratedWeatherData.setHumidity(humidity);
    }

}