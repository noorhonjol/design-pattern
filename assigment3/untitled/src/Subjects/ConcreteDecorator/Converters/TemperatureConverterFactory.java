package Subjects.ConcreteDecorator.Converters;

public class TemperatureConverterFactory {
    public static TemperatureConverter createConverter(TemperatureUnit fromUnit) {
        return switch (fromUnit) {
            case FAHRENHEIT -> new FahrenheitConverter();
            default -> new CelsiusConverter();
        };
    }
}
