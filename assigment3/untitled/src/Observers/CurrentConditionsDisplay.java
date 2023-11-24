package Observers;

import Subjects.Component.WeatherDataSubject;

public class CurrentConditionsDisplay implements WeatherDataObserver{
    private final WeatherDataSubject subject;
    public CurrentConditionsDisplay(WeatherDataSubject subject){
        this.subject=subject;
        subject.getEventManger().addObserver(this);
    }
    @Override
    public void update(String val, String type) {
        System.out.println("the "+type+" is updated to "+val);
        System.out.println("the current data is : ");
        subject.printWeatherInfo();
    }
}
