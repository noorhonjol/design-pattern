package Subjects.ConcreteDecorator;

import Subjects.Component.WeatherDataSubject;
import Subjects.ConcreteDecorator.Converters.TemperatureConverterFactory;
import Subjects.ConcreteDecorator.Converters.TemperatureUnit;
import Subjects.Decorator.WeatherDataDecorator;

public class TemperatureUnitsDecorator extends WeatherDataDecorator {
    private TemperatureUnit originalUnitType;
    private TemperatureUnit currentUnitType;

    public TemperatureUnitsDecorator(WeatherDataSubject decoratedWeatherData) {
        this(decoratedWeatherData, TemperatureUnit.CELSIUS);
    }

    public TemperatureUnitsDecorator(WeatherDataSubject decoratedWeatherData, TemperatureUnit unitType) {
        super(decoratedWeatherData);
        this.originalUnitType = unitType;
        this.currentUnitType = unitType;
    }

    public void setUnitType(TemperatureUnit unitType) {
        this.currentUnitType = unitType;
        decoratedWeatherData.getEventManger().notifyObservers(unitType.toString(), "unit type");
    }

    @Override
    public void printWeatherInfo() {
        decoratedWeatherData.printWeatherInfo();

        TemperatureUnit sourceUnit = originalUnitType;
        TemperatureUnit targetUnit = currentUnitType;

        System.out.println("Temperature in " + targetUnit + " is "
                + TemperatureConverterFactory.createConverter(sourceUnit)
                .convert(getTemperature(), targetUnit));
    }
}
