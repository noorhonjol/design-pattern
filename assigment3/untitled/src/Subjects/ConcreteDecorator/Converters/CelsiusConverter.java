package Subjects.ConcreteDecorator.Converters;

public class CelsiusConverter implements TemperatureConverter{
    @Override
    public double convert(double temperature, TemperatureUnit toUnit) {
        if (toUnit == TemperatureUnit.FAHRENHEIT) {
            return temperature * 9 / 5 + 32;
        } else {
            return temperature;
        }
    }
}
