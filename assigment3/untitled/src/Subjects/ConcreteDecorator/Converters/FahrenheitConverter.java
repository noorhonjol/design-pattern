package Subjects.ConcreteDecorator.Converters;

public class FahrenheitConverter implements TemperatureConverter{
    @Override
    public double convert(double temperature, TemperatureUnit toUnit) {

        if (toUnit == TemperatureUnit.CELSIUS) {
            return (temperature - 32) * 5 / 9;
        } else {
            return temperature;
        }

    }
}
